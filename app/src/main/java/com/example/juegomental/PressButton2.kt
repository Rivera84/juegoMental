package com.example.juegomental

import android.graphics.Color
import android.os.AsyncTask
import android.util.Log
import android.widget.Button


class PressButton2(val btn1 : Button, val btn2: Button, val btn3: Button, val btn4: Button, val btn5:Button, val btn6:Button, val color: Int): AsyncTask<Void, Void, String>(){



    override fun doInBackground(vararg params: Void?): String {
        try {
            Log.d("PressButtom","Hola")
            nuevoColor(color)
            colorAntes()}
        catch (e: InterruptedException) {
        }
        return toString()

    }




    //Colores iniciales de los botones
    private fun colorAntes() {
        Thread.sleep(250)
        btn1.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn2.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn3.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn4.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn5.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn6.setBackgroundColor(Color.parseColor("#72CC0000"))

    }

    //Colores secundarios con los que se enciende la app
    private fun nuevoColor(numeroBoton: Int) {

        when (numeroBoton) {
            1 -> btn1.setBackgroundColor(Color.RED)
            2 -> btn2.setBackgroundColor(Color.RED)
            3 -> btn3.setBackgroundColor(Color.RED)
            4 -> btn4.setBackgroundColor(Color.RED)
            5 -> btn5.setBackgroundColor(Color.RED)
            6 -> btn6.setBackgroundColor(Color.RED)
        }

    }
}