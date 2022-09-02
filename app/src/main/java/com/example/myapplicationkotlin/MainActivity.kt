package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
    }

    private fun variables(){

        //Variables
        var myFirstVariable = "Hola Gente"
        var mySecondVarible = 2
        var myTryVariable = "Soy Horacio"
        println(myFirstVariable)

        //Se puede asignar nuevos valores a la variable
        myFirstVariable = "Bienvenidos a todos"
        println(myFirstVariable)

        //No se puede cambiar el tipo de dato de una variable previamente definida
        //myFirstVariable = 1
        mySecondVarible = 2222
        println(mySecondVarible)

        //Siempre y cuando se respete el tipo de dato, se puede asignar el valor que deseemos
        //Incluso asignar el mismo tipo de dato de otras variables
        myFirstVariable = myTryVariable
        println(myFirstVariable)

        //Aun cuando se asigne la variable a otra, aun se puede usar
        myFirstVariable = "Holiiss"
        println(myFirstVariable)




        //Constantes

        val myFirstConstant = "Soy una constante?"
        println(myFirstConstant)
        //Una constante no puede modificar su variable
        //myFirstConstant = "si"

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }
}