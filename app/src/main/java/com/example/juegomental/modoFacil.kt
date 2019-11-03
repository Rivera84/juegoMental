package com.example.juegomental


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modo_facil.*


class modoFacil : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val txtPuntos :TextView = findViewById(R.id.txtnPuntos)

        btniniciar.setOnClickListener() {

            val getBotonTask = getBotonTask(btn1,btn2,btn3,btn4,txtPuntos)
                getBotonTask.execute()

                /*colorActual()
                nuevoColor(aleatorio())

                 */
        }


        }



/*
    fun nuevoColor(numeroBoton:Int){
        txtnPuntos.append(numeroBoton.toString())
        when(numeroBoton){
            1 -> btn1.setBackgroundColor(Color.GREEN)
            2 -> btn2.setBackgroundColor(Color.RED)
            3 -> btn3.setBackgroundColor(Color.YELLOW)
            4 -> btn4.setBackgroundColor(Color.BLUE)
            else -> colorActual()
        }

    }

     fun colorActual() {
        try {

            btn1.setBackgroundColor(Color.parseColor("#79669900" ))
            btn2.setBackgroundColor(Color.parseColor("#72CC0000"))
            btn3.setBackgroundColor(Color.parseColor("#77FFBB33"))
            btn4.setBackgroundColor(Color.parseColor("#740099CC"))
        } catch (e: InterruptedException) {
        }

    }*/




}
