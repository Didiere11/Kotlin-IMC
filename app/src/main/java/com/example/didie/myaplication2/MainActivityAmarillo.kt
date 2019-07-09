package com.example.didie.myaplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_amarillo.*
import kotlinx.android.synthetic.main.activity_main_verde.*

class MainActivityAmarillo : AppCompatActivity() {
    companion object AmarilloCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_amarillo)

        val intent  = intent
        if(intent!=null && intent.hasExtra(MainActivityAmarillo.EXTRA_IMC)){
            val imc:Double = intent.getDoubleExtra(MainActivityAmarillo.EXTRA_IMC, MainActivityAmarillo.DEFAULT_IMC)
            tvRagular.setText("tu peso es Regular "+imc.toString())
        }
    }
}
