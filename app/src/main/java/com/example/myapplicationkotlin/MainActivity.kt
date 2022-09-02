package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
        tiposDeDatos()
    }

    private fun variables(){

        /*  Variables  */
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
    private fun tiposDeDatos(){


        //String - Cadena de Texto
        val myString = "hola soy una string!"
        //Se puede colocar el tipo de dato seguido de doble punto
        val myString2: String = "y me puedo concatenar"
        //Se puede concatenar multiples strings
        val myString3: String = myString + " " + myString2
        println(myString3)


        //Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        //No se pueden concatenar, si no que se se sumar y demas operaciones matematicas
        val myInt3 = myInt + myInt2
        println(myInt3)


        //Decimales (Float, Double)
        val myDouble: Double = 1.5
        val myFloat: Float = 1.5f
        val myDouble2 = 2.6
        //Se pueden sumar enteros y decimales
        val myDouble3 = 1
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)


        //Booleanos
        val myBool = true
        val myBool2: Boolean = false

    }
}