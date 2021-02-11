package com.example.laboratorio01


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import net.objecthunter.exp4j.ExpressionBuilder

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)
        /*Number Buttons*/
        val pantalla1 = findViewById<TextView>(R.id.pantalla1)
        val pantalla = findViewById<TextView>(R.id.pantalla)
        val uno = findViewById<Button>(R.id.uno)
        uno.setOnClickListener {
            evaluateExpression("1", clear = true)
        }
        val dos = findViewById<Button>(R.id.dos)
        dos.setOnClickListener {
            evaluateExpression("2", clear = true)
        }
        val tres = findViewById<Button>(R.id.tres)
        tres.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        val cuatro = findViewById<Button>(R.id.cuatro)
        cuatro.setOnClickListener {
            evaluateExpression("4", clear = true)
        }
        val cinco = findViewById<Button>(R.id.cinco)
        cinco.setOnClickListener {
            evaluateExpression("5", clear = true)
        }
        val seis = findViewById<Button>(R.id.seis)
        seis.setOnClickListener {
            evaluateExpression("6", clear = true)
        }
        val siete = findViewById<Button>(R.id.siete)
        siete.setOnClickListener {
            evaluateExpression("7", clear = true)
        }
        val ocho = findViewById<Button>(R.id.ocho)
        ocho.setOnClickListener {
            evaluateExpression("8", clear = true)
        }
        val nueve = findViewById<Button>(R.id.nueve)
        nueve.setOnClickListener {
            evaluateExpression("9", clear = true)
        }
        val cero = findViewById<Button>(R.id.cero)
        cero.setOnClickListener {
            evaluateExpression("0", clear = true)
        }
        val mas = findViewById<Button>(R.id.mas)
        mas.setOnClickListener {
            evaluateExpression("+", clear = true)
        }
        val menos = findViewById<Button>(R.id.menos)
        menos.setOnClickListener {
            evaluateExpression("-", clear = true)
        }

        val borrar = findViewById<Button>(R.id.borrar)
        borrar.setOnClickListener {
            pantalla.text = ""
            pantalla1.text = ""
        }

        /*Function to calculate the expressions using expression builder library*/
        val igual = findViewById<Button>(R.id.igual)
        igual.setOnClickListener {
            val text = pantalla1.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                pantalla.text = longResult.toString()
            } else {
                pantalla.text = result.toString()
            }
        }

    }
    private fun evaluateExpression(string: String, clear: Boolean) {
        if(clear) {
            val pantalla1 = findViewById<TextView>(R.id.pantalla1)
            val pantalla = findViewById<TextView>(R.id.pantalla)
            pantalla.text = ""
            pantalla1.append(string)
        } else {
            val pantalla1 = findViewById<TextView>(R.id.pantalla1)
            val pantalla = findViewById<TextView>(R.id.pantalla)
            pantalla1.append(pantalla.text)
            pantalla1.append(string)
            pantalla.text = ""
        }
    }

}