package com.example.juegomental

import android.graphics.Color
import android.os.AsyncTask
import android.widget.Button
import android.widget.TextView
import java.util.*

class getBotonTask(val btn1 : Button, val btn2: Button, val btn3: Button, val btn4: Button, val txtPunto: TextView, val numeroBoton: Int): AsyncTask<Void, Void, String>(){



    override fun onPreExecute() {

        txtPunto.append(numeroBoton.toString())
            nuevoColor(numeroBoton)

    }

    override fun doInBackground(vararg params: Void?): String {
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
        }
        return toString()
    }


    override fun onPostExecute(result: String?) {

        btn1.setBackgroundColor(Color.parseColor("#79669900"))
        btn2.setBackgroundColor(Color.parseColor("#72CC0000"))
        btn3.setBackgroundColor(Color.parseColor("#77FFBB33"))
        btn4.setBackgroundColor(Color.parseColor("#740099CC"))



    }


    fun nuevoColor(numeroBoton: Int) {

        when (numeroBoton) {
            1 -> btn1.setBackgroundColor(Color.GREEN)
            2 -> btn2.setBackgroundColor(Color.RED)
            3 -> btn3.setBackgroundColor(Color.YELLOW)
            4 -> btn4.setBackgroundColor(Color.BLUE)
        }
    }

}