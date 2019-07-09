package com.example.didie.myaplication2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pes : Int=0
    var alt : Double = 0.0
    var imc : Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularIMC(v: View){
        if(etPeso.text.isEmpty()){
            Toast.makeText(this, "Falta el peso en KG",Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        }else if (etAltura.text.isEmpty()){
            Toast.makeText( this, "Falta la altura en MTS",Toast.LENGTH_LONG).show()
            etAltura.requestFocus()
        }
        else
        {
            pes = etPeso.text.toString().toInt()
            alt = etAltura.text.toString().toDouble()
            imc = pes / (alt*alt)

           /* if (imc<25){
                val intent = Intent(this, MainActivityVerde::class.java)
                intent.putExtra(MainActivityVerde.EXTRA_IMC,imc)
                startActivity(intent)

                Toast.makeText(this,"Tu imc es: $imc es adecuado",Toast.LENGTH_SHORT).show()

            }
            else if(imc>=25 && imc<30){
                val intent = Intent(this, MainActivityAmarillo::class.java)
                intent.putExtra(MainActivityAmarillo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es de sobrepeso",Toast.LENGTH_SHORT).show()
            }
            else if (imc>30 && imc<40){
                val intent = Intent(this, MainActivityrojo::class.java)
                intent.putExtra(MainActivityrojo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es obecidad",Toast.LENGTH_SHORT).show()

            }*/
           // Toast.makeText(this, "tu peso es de :$imc",Toast.LENGTH_LONG).show()

           when {
                imc<25 -> {
                 val intent = Intent(this, MainActivityVerde::class.java)
                intent.putExtra(MainActivityVerde.EXTRA_IMC,imc)
                startActivity(intent)

                Toast.makeText(this,"Tu imc es: $imc es adecuado",Toast.LENGTH_SHORT).show()
                }

                imc>=25 && imc<30 -> {
                 val intent = Intent(this, MainActivityAmarillo::class.java)
                intent.putExtra(MainActivityAmarillo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es de sobrepeso",Toast.LENGTH_SHORT).show()
                }
                imc>30 && imc<40 ->   {
                val intent = Intent(this, MainActivityrojo::class.java)
                intent.putExtra(MainActivityrojo.EXTRA_IMC,imc)
                startActivity(intent)
                Toast.makeText(this,"Tu imc es: $imc es obecidad",Toast.LENGTH_SHORT).show()
                }

            }

        }
    }

}
