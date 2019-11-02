package com.example.juegomental


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import kotlinx.android.synthetic.main.activity_modo_facil.*
import java.util.*

class modoFacil : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)


        btniniciar.setOnClickListener(){


            var numeroBoton=aleatorio()

            txtnPuntos.append(numeroBoton.toString())
            // Thread.sleep(1000)

            if(numeroBoton==1) {
                btn1.setBackgroundColor(Color.GREEN)

                btn1.setBackgroundColor(Color.parseColor("#79669900"))

            }

            if(numeroBoton==2) {
                btn2.setBackgroundColor(Color.RED)
            }

            if(numeroBoton==3) {
                btn3.setBackgroundColor(Color.YELLOW)
            }

            if(numeroBoton==4) {
                btn4.setBackgroundColor(Color.BLUE)
            }


        }

        }


    fun aleatorio():Int{

        var random= Random()

       val num1= (random.nextInt ( 4 )+1)
    return num1
    }

}
