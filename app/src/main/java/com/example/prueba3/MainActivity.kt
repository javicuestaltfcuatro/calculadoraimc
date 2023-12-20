package com.example.prueba3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuadroEntrada1 : EditText = findViewById(R.id.input1)
        val cuadroEntrada2 : EditText = findViewById(R.id.input2)
        val cuadroSalida : TextView = findViewById(R.id.textView)
        val miBoton : Button = findViewById(R.id.button2)

        miBoton.setOnClickListener{
            var textoIntro = cuadroEntrada1.text.toString().toDouble()/(cuadroEntrada2.text.toString().toDouble()*cuadroEntrada2.text.toString().toDouble())
            cuadroSalida.text = textoIntro.toString()
        }


    }


}