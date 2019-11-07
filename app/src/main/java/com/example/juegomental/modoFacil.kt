package com.example.juegomental


import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modo_facil.*
import java.util.*
import kotlin.collections.ArrayList


var listaNumero = ArrayList<Int>() //Arreglo para guardar la secuencia de numeros
var listaBotones = ArrayList<Int>() //Arreglo para guardar la secuencia de botones pulsadas


class modoFacil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)

        //Declaracion de los botones y txtViews

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val txtPuntos: TextView = findViewById(R.id.txtnPuntos)
        val txtNivel: TextView = findViewById(R.id.txtNivel)


        //Programacion del Boton inicial
        tomarBotones(btn1,btn2,btn3,btn4,txtNivel)

            btniniciar.setOnClickListener() {
                listaBotones = ArrayList<Int>()

                //llamar a la clase AsyncTask
                val getBotonTask =
                        getBotonTask(btn1, btn2, btn3, btn4, txtPuntos, aleatorio())
                    getBotonTask.execute()
                txtPuntos.append(listaNumero.toString())
            }
    }

}


//Funcion para generar el numero aleatorio
fun aleatorio(): Int {
    var random = Random()
    val num1 = (random.nextInt(4) + 1)
    return num1
}



//Almacenar en arreglo los botones pulsados
fun tomarBotones(btn1:Button, btn2:Button, btn3:Button,btn4:Button, txtNivel:TextView) {
    var botonActivado=0

    btn1.setOnClickListener {
        botonActivado=1
        listaBotones.add(botonActivado)
        txtNivel.append(listaBotones.toString())
    }
    btn2.setOnClickListener {
        botonActivado=2
        listaBotones.add(botonActivado)
        txtNivel.append(listaBotones.toString())
    }
    btn3.setOnClickListener {
        botonActivado=3
        listaBotones.add(botonActivado)
        txtNivel.append(listaBotones.toString())
    }
    btn4.setOnClickListener {
        botonActivado=4
        listaBotones.add(botonActivado)
        txtNivel.append(listaBotones.toString())
    }


}


