package com.example.juegomental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComoJugar.setOnClickListener(){
            val Intent= Intent(this,comoJugar::class.java)
            startActivity(Intent )
        }

        btnIniciarPartida.setOnClickListener(){
            val Intent = Intent(this, Dificultad::class.java)
            startActivity(Intent)
        }
    }





}
