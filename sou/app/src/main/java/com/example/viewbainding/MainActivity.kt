package com.example.viewbainding

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isGone
import com.example.viewbainding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.web.loadUrl("https://www.youtube.com/")
        binding.web.settings.javaScriptEnabled = true
        binding.web.webViewClient = object : WebViewClient(){


            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.web.visibility = View.GONE
                binding.web2.visibility= View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.web.visibility = View.VISIBLE
                binding.web2.visibility = View.GONE

            }



        }

        }

    override fun onBackPressed() {

        if (binding.web.canGoBack()){
            binding.web.goBack()
        }else{
            super.onBackPressed()
        }

    }

    }
