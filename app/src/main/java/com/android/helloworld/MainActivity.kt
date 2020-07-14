package com.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val btn1:Button = findViewById(R.id.button_1)
        btn1.setOnClickListener{ view ->
            Toast.makeText(this, "Click en el boton 1", Toast.LENGTH_SHORT).show()
        }
            val tv2: TextView = findViewById(R.id.textView_2)
        tv2.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        Toast.makeText(this, "Click en el texto 2", Toast.LENGTH_SHORT).show()
    }
    fun clickOnFruta(view: View) {
        val checkBox: CheckBox = view as CheckBox
        val checked: Boolean = checkBox.isChecked
        when (view.id) {
            R.id.checkbox_frutas -> {
                if (checked) {
                    Toast.makeText(this, "Se ha hecho click en Frutas", Toast.LENGTH_LONG).show()

                } else {
                    Toast.makeText(this, "Se ha desmarcado Fruta", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun sexoSeleccionado(view: View) {
        val radioButtonSeleccionado = view as RadioButton

        when (view.id) {
            R.id.radioButtonMujer -> {
                Toast.makeText(this, "Se ha seleccionado Mujer", Toast.LENGTH_SHORT).show()
            }
            R.id.radioButtonHombre -> {
                Toast.makeText(this, "Se ha seleccionado Hombre", Toast.LENGTH_SHORT).show()
            }
        }
    }

}



