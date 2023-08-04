package com.example.sumatorianumeros


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.databinding.DataBindingUtil
import com.example.sumatorianumeros.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)




        val suma = {x:Int,y:Int -> x + y}
        val resta = {x:Int,y:Int -> x - y}
        val multiplicacion = {x:Int,y:Int -> x * y}
        val division = {x:Int,y:Int -> x / y}
        val cuadrado = {x:Int -> x*x}
        binding.appCompatButton.setOnClickListener {

            Toast.makeText(this,"Resta",Toast.LENGTH_LONG).show()
           println( cuadrado(binding.numero1.text.toString().toInt(),binding.numero2.text.toString().toInt()))

            Toast.makeText(this,"cuadrado",Toast.LENGTH_LONG).show()

            Toast.makeText(this,"multiplicacion",Toast.LENGTH_LONG).show()

            val intent = Intent(this@MainActivity,Main2::class.java)
            intent.putExtra("result",cuadrado(binding.numero1.text.toString().toInt(),binding.numero2.text.toString().toInt()))
            startActivity(intent)
        }
    }



}