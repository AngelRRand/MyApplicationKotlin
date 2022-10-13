package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        //Las constantes no pueden estar junto a las demas variables
        const val moneda = "EUR"
    }

    //Los datos de tipo float se les da a las variables que contengan un numeros decimales
    //Se les añade una f, al final.

    var saldo :Float = 300.54f

    //Los datos de tipo Double son un tipo de dato que usa mucho mas espacio de memoria que el resto.
    var sueldo = 464.82

    //Los enteros no admiten numeros decimales
    var entero :Int = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Los valores y las variables son diferentes.
        val fecha = "14/09/2022"
        var nombre = "Orasio"
        var vip = false
        nombre = "Horacio"



        var saludo = "Hola " + nombre + " la fecha en la que empezaste a estudiar es " + fecha + " tu saldo es de " + saldo.toString() + " $"
        println(saludo)
        //println(moneda)

    }

}