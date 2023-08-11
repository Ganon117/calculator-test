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




        val suma = {x:Int,y:Int -> x + y}
        val resta = {x:Int,y:Int -> x - y}
        val triple_producto = {x:Int -> 3 * x}
        binding.appCompatButton.setOnClickListener {
           println( resta(binding.suma1.text.toString().toInt(),binding.suma2.text.toString().toInt()))
            println( triple_producto(binding.suma1.text.toString().toInt(),binding.suma2.text.toString().toInt()))

            Toast.makeText(this,"resta",Toast.LENGTH_LONG).show()
            Toast.makeText(this,"triple_producto",Toast.LENGTH_LONG).show()

            val intent = Intent(this@MainActivity,Main2::class.java)
            intent.putExtra("result",resta(binding.numero1.text.toString().toInt(),binding.numero2.text.toString().toInt()))
            intent.putExtra("result",triple_producto(binding.numero1.text.toString().toInt(),binding.numero2.text.toString().toInt()))
            startActivity(intent)
        }
    }



}