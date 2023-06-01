package com.example.radiobuttoncheckboxswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.radiobuttoncheckboxswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.switchs.setOnCheckedChangeListener{Button,b->
            if (b){
                Toast.makeText(this, "Yondi", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "O'chdi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}