package com.example.juegomental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_como_jugar.*

class comoJugar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_jugar)

        btnAtras.setOnClickListener(){
            val Intent= Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
