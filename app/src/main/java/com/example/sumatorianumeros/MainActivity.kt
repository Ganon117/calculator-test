package com.example.sumatorianumeros


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.databinding.DataBindingUtil
import com.example.sumatorianumeros.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)




        val suma = {x:Int,y:Int -> x - y}
        binding.appCompatButton.setOnClickListener {
           println( suma(binding.suma1.text.toString().toInt(),binding.suma2.text.toString().toInt()))
            val intent = Intent(this@MainActivity,Main2::class.java)
            intent.putExtra("result",suma(binding.suma1.text.toString().toInt(),binding.suma2.text.toString().toInt()))
            startActivity(intent)
        }
    }



}