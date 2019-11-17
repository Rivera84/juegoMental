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


class modoDificil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modo_dificil)

        listaNumero = ArrayList<Int>() //Arreglo para guardar la secuencia de numeros
        listaBotones = ArrayList<Int>() //Arreglo para guardar la secuencia de botones pulsadas
        nivel=0
        punto=0

        //Declaracion de los botones y txtViews
        val btn1modoDificil: Button = findViewById(R.id.btn1ModoDificil)
        val btn2modoDificil: Button = findViewById(R.id.btn2ModoDificil)
        val btn3modoDificil: Button = findViewById(R.id.btn3ModoDificil)
        val btn4modoDificil: Button = findViewById(R.id.btn4ModoDificil)
        val btn5modoDificil: Button= findViewById(R.id.btn5ModoDificil)
        val btn6modoDificil: Button= findViewById(R.id.btn6ModoDificil)
        val txtPuntos: TextView = findViewById(R.id.txtnPuntos)
        val txtNivel: TextView = findViewById(R.id.txtNivel)


        btniniciar.setOnClickListener {

            txtNivel.text = ""
            txtPuntos.text = ""
            txtPuntos.append(punto.toString())
            txtNivel.append(nivel.toString())

            if(listaNumero== listaBotones){
                listaBotones = ArrayList()

                //llamar a la clase AsyncTask
                val getBotonTask =
                    getBotonTask2(btn1modoDificil,btn2modoDificil,btn3modoDificil,btn4modoDificil,txtPuntos,aleatorio(),btn5modoDificil,btn6modoDificil)
                getBotonTask.execute()

                nivel+=1
                punto += 5

            } else if(listaNumero!= listaBotones){
                nivel-=1
                punto -= 5
                if(punto<=0 && nivel<=0){
                    nivel=0
                    punto=0
                }
                txtNivel.text = ""
                txtPuntos.text = ""
                txtPuntos.append(punto.toString())
                txtNivel.append(nivel.toString())
                val intent= Intent(this,MainActivity::class.java)
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Has Perdido")
                builder.setMessage("Puntos:$punto   Nivel:$nivel")
                builder.setNegativeButton("Ok"){ _: DialogInterface, _: Int->
                    startActivity(intent)
                    finish()

                }
                builder.show()
            }



        }

        btnSalir.setOnClickListener {
            nivel-=1
            punto -= 5
            if(punto<=0 && nivel<=0){
                nivel=0
                punto=0
            }
            txtNivel.text = ""
            txtPuntos.text = ""
            txtPuntos.append(punto.toString())
            txtNivel.append(nivel.toString())
            val intent=Intent(this,MainActivity::class.java)
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Tu puntuación es:")
            builder.setMessage("Puntos:$punto   Nivel:$nivel")
            builder.setNegativeButton("Ok"){ _:DialogInterface, _: Int->
                startActivity(intent)
                finish()

            }
            builder.show()

        }

    }

    //Funcion para generar el numero aleatorio
  private fun aleatorio(): Int {
        val random = Random()
        return (random.nextInt(6) + 1)
    }

    //Almacenar en arreglo los botones pulsados
   fun tomarboton(btn1:Button, btn2:Button, btn3:Button,btn4:Button, btn5:Button, btn6:Button) {
        var botonActivado: Int
        Log.d("ArregloBotones","Hola")

        btn1.setOnClickListener {
            botonActivado=1
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,1)
            pressButton2.execute()
            listaBotones.add(botonActivado)
        }


        btn2.setOnClickListener {
            botonActivado=2
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,2)
            pressButton2.execute()
            listaBotones.add(botonActivado)

        }
        btn3.setOnClickListener {
            botonActivado=3
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,3)
            pressButton2.execute()
            listaBotones.add(botonActivado)

        }
        btn4.setOnClickListener {
            botonActivado=4
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,4)
            pressButton2.execute()
            listaBotones.add(botonActivado)

        }
        btn5.setOnClickListener {
            botonActivado=5
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,5)
            pressButton2.execute()
            listaBotones.add(botonActivado)

        }
        btn6.setOnClickListener {
            botonActivado=6
            val pressButton2 = pressButton2(btn1,btn2,btn3,btn4,btn5,btn6,6)
            pressButton2.execute()
            listaBotones.add(botonActivado)

        }
    }

}
