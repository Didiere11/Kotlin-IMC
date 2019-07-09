package com.example.didie.myaplication2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activityrojo.*
import kotlinx.android.synthetic.main.activity_main_amarillo.*
import kotlinx.android.synthetic.main.activity_main_verde.*

class MainActivityrojo : AppCompatActivity() {
    companion object RojoCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityrojo)
        val intent  = intent
        if(intent!=null && intent.hasExtra(MainActivityrojo.EXTRA_IMC)){
            val imc:Double = intent.getDoubleExtra(MainActivityrojo.EXTRA_IMC, MainActivityrojo.DEFAULT_IMC)
            tvMal.setText(" Tienes obecidad "+imc.toString())
        }
    }
}
