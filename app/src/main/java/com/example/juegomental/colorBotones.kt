package com.example.juegomental

import android.graphics.Color
import android.os.AsyncTask
import android.util.Log
import android.widget.Button
import android.widget.TextView


class getBotonTask(val btn1 : Button, val btn2: Button, val btn3: Button, val btn4: Button, val txtPunto: TextView, val numeroAleatorio:Int): AsyncTask<Void, Void, String>(){

//añade el orden de numeros al arraylist
    override fun onPreExecute() {

        listaNumero.add(numeroAleatorio)

    }



    //Se trabaja el ciclo for para imprimir la secuencia de colores en el arreglo
    override fun doInBackground(vararg params: Void?): String {
        try {
           // Log.d("background","Hola")
            for(numero in listaNumero) {

                Log.d("CicloFor","Hola")
                Thread.sleep(500)
                nuevoColor(numero)
                colorAntes()

            }

        }
        catch (e: InterruptedException) {
        }
        tomarBotones(btn1,btn2,btn3,btn4)
        return toString()

    }



        //Colores iniciales de los botones
    fun colorAntes(){
        Thread.sleep(500)
        btn1.setBackgroundColor(Color.parseColor("#79669900"))
        btn2.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn3.setBackgroundColor(Color.parseColor("#77FFBB33"))
        btn4.setBackgroundColor(Color.parseColor("#740099CC"))


    }

    //Colores secundarios con los que se enciende la app
    fun nuevoColor(numeroBoton: Int) {

        when (numeroBoton) {
            1 -> btn1.setBackgroundColor(Color.GREEN)
            2 -> btn2.setBackgroundColor(Color.RED)
            3 -> btn3.setBackgroundColor(Color.YELLOW)
            4 -> btn4.setBackgroundColor(Color.BLUE)
        }
    }

}