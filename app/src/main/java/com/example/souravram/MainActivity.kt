package com.example.souravram

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.souravram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {

            Toast.makeText(this, "Successfully Click", Toast.LENGTH_LONG).show()
        }
        binding.switchButton.setOnCheckedChangeListener(this)


    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        if (p1==true){
            Toast.makeText(this,"Button on", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Button off", Toast.LENGTH_LONG).show()

        }
    }
}