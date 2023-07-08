package com.example.sumatorianumeros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.sumatorianumeros.databinding.Activity2Binding

class Main2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: Activity2Binding = DataBindingUtil.setContentView(this,R.layout.activity2)
        val resultIntent = intent.getIntExtra("result",0)
        println("Imprimiendo cosasss $resultIntent")
        binding.totalAdd.text = resultIntent.toString()

    }
}