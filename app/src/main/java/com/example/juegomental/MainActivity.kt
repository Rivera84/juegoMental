package com.example.juegomental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComoJugar.setOnClickListener{
            val intent= Intent(this,ComoJugar::class.java)
            startActivity(intent )
        }

        btnIniciarPartida.setOnClickListener{
            val intent = Intent(this, Dificultad::class.java)
            startActivity(intent)
        }
        btnSalir.setOnClickListener{
            exitProcess(0)
        }
    }





}
