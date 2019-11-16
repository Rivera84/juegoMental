package com.example.juegomental


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modo_facil.*
import java.util.*
import kotlin.collections.ArrayList


var listaNumero = ArrayList<Int>() //Arreglo para guardar la secuencia de numeros
var listaBotones = ArrayList<Int>() //Arreglo para guardar la secuencia de botones pulsadas
var nivel=0
var punto=0

class modoFacil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_facil)

        listaNumero = ArrayList<Int>() //Arreglo para guardar la secuencia de numeros
        listaBotones = ArrayList<Int>() //Arreglo para guardar la secuencia de botones pulsadas
        nivel=0
        punto=0

        //Declaracion de los botones y txtViews

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val txtPuntos: TextView = findViewById(R.id.txtnPuntos)
        val txtNivel: TextView = findViewById(R.id.txtNivel)


           btniniciar.setOnClickListener {

                   var c=1
               txtNivel.text = ""
               txtPuntos.text = ""

                txtPuntos.append(punto.toString())
                txtNivel.append(nivel.toString())

                if(listaNumero== listaBotones){
                listaBotones = ArrayList()

                //llamar a la clase AsyncTask
                val getBotonTask =
                        getBotonTask(btn1, btn2, btn3, btn4, txtPuntos, aleatorio())
                    getBotonTask.execute()



                    nivel+=1
                    punto += 5

             /*       if(listaNumero==listaBotones) {
                        recreate()
                    }

              */

                } else if(listaNumero!= listaBotones){

                    val intent=Intent(this,MainActivity::class.java)
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Has Perdido")
                    builder.setMessage("Puntos:$punto   Nivel:$nivel")
                    builder.setNegativeButton("Ok"){ dialogInterface :DialogInterface,_: Int->
                        startActivity(intent)
                        finish()

                    }
                    builder.show()
                }



           }

        btnSalir.setOnClickListener {
            val Intent= Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }


    }

}


//Funcion para generar el numero aleatorio
private fun  aleatorio(): Int {
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



