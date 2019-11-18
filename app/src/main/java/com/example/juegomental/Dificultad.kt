package com.example.juegomental

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dificultad.*

class Dificultad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificultad)

        btnDificultad.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        chkFacil.setOnClickListener {
            val intent=Intent(this,ModoFacil::class.java)
            startActivity(intent)
        }

        chkDificil.setOnClickListener{
            val intent=Intent(this,modoDificil::class.java)
            startActivity(intent)
        }

    }
}
