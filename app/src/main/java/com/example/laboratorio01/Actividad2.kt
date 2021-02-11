package com.example.laboratorio01


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder


class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)
        /*Number Buttons*/

        tvUno.setOnClickListener {
            evaluateExpression("1", clear = true)
        }

     //   val bundle = intent.extras

      //  if(bundle != null){
         //   val valueA: String = bundle.getString("ValueA", "")
         //   Toast.makeText(this, valueA, Toast.LENGTH_SHORT).show()
           // val txtValue: TextView = findViewById(R.id.txtValue)
          //  txtValue.text = valueA
       // }
    }
}