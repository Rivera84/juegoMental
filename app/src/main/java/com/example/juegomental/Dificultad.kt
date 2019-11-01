package com.example.juegomental

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dificultad.*

class Dificultad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificultad)

        btnDificultad.setOnClickListener(){
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)

        }

        chkFacil.setOnClickListener(){
            val Intent=Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

    }
}
