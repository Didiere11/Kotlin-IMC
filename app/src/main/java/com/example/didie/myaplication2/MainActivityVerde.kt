package com.example.didie.myaplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_amarillo.*
import kotlinx.android.synthetic.main.activity_main_verde.*

class MainActivityVerde : AppCompatActivity() {
    companion object VerdeCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_verde)

        val intent  = intent

        if(intent!=null && intent.hasExtra(EXTRA_IMC)){
            val imc:Double = intent.getDoubleExtra(EXTRA_IMC, DEFAULT_IMC)
            tvBien.setText("Tu peso es Adecuado "+imc.toString())
        }
    }

}
