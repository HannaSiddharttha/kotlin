package com.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        Log.i("LOGCICLO","Entramos en metodo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LOGCICLO","Entramos en metodo onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("LOGCICLO","Entramos en metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LOGCICLO","Entramos en metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LOGCICLO","Entramos en metodo onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOGCICLO","Entramos en metodo onDestroy")
    }

    fun clickOnFruta(view: View) {
        val checkBox: CheckBox = view as CheckBox
        val checked: Boolean = checkBox.isChecked
        when(view.id){
            R.id.checkbox_frutas -> {
                if (checked){
                    Toast.makeText(this,"Se ha hecho click en Frutas", Toast.LENGTH_LONG).show()

                }else{
                    Toast.makeText(this, "Se ha desmarcado Fruta", Toast.LENGTH_LONG).show()
            }
        }
        }
    }

}