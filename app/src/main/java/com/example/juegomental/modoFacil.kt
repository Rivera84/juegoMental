package com.example.juegomental


import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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

            var nivel=0
            var punto=0
           btniniciar.setOnClickListener {
               txtNivel.text = ""
               txtPuntos.text = ""


                txtNivel.append(nivel.toString())

                if(listaNumero== listaBotones){
                listaBotones = ArrayList()

                //llamar a la clase AsyncTask
                val getBotonTask =
                        getBotonTask(btn1, btn2, btn3, btn4, txtPuntos, aleatorio())
                    getBotonTask.execute()



                    nivel+=1
                    punto += 5

                } else if(listaNumero!= listaBotones){
                Toast.makeText(applicationContext,"Has perdido",Toast.LENGTH_SHORT).show()
               }

               txtPuntos.append(punto.toString())
           }

        //recreate()

    }

}


//Funcion para generar el numero aleatorio
fun aleatorio(): Int {
    val random = Random()
    return (random.nextInt(4) + 1)
}



//Almacenar en arreglo los botones pulsados
fun tomarBotones(btn1:Button, btn2:Button, btn3:Button,btn4:Button) {
    var botonActivado: Int
    Log.d("ArregloBotones","Hola")

    btn1.setOnClickListener {
        botonActivado=1
        val pressButton = pressButton(btn1,btn2,btn3,btn4,1)
        pressButton.execute()
        listaBotones.add(botonActivado)
    }


    btn2.setOnClickListener {
        botonActivado=2
        val pressButton = pressButton(btn1,btn2,btn3,btn4,2)
        pressButton.execute()
        listaBotones.add(botonActivado)

    }
    btn3.setOnClickListener {
        botonActivado=3
        val pressButton = pressButton(btn1,btn2,btn3,btn4,3)
        pressButton.execute()
        listaBotones.add(botonActivado)

    }
    btn4.setOnClickListener {
        botonActivado=4
        val pressButton = pressButton(btn1,btn2,btn3,btn4,4)
        pressButton.execute()
        listaBotones.add(botonActivado)

    }


}


