package com.example.juegomental


import android.graphics.Color
import android.os.AsyncTask
import android.util.Log
import android.widget.Button


class PressButton(val btn1 : Button, val btn2: Button, val btn3: Button, val btn4: Button, val color: Int): AsyncTask<Void, Void, String>(){



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
    private fun colorAntes(){
        Thread.sleep(250)
        btn1.setBackgroundColor(Color.parseColor("#79669900"))
        btn2.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn3.setBackgroundColor(Color.parseColor("#77FFBB33"))
        btn4.setBackgroundColor(Color.parseColor("#740099CC"))


    }

    //Colores secundarios con los que se enciende la app
    private fun nuevoColor(numeroBoton: Int) {

        when (numeroBoton) {
            1 -> btn1.setBackgroundColor(Color.GREEN)
            2 -> btn2.setBackgroundColor(Color.RED)
            3 -> btn3.setBackgroundColor(Color.YELLOW)
            4 -> btn4.setBackgroundColor(Color.BLUE)
        }

    }

}