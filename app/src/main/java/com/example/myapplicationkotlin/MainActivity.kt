package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{

        //Constantes
        const val moneda = "EUR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "14/09/2022"
        var nombre = "Orasio"

        nombre = "Horacio"
        println(nombre)
        println(fecha)
        println(moneda)

    }

}