package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        //Las constantes no pueden estar junto a las demas variables
        const val moneda = "EUR"
    }

    //Los date de tipo float se les da a las variables que contengan un numeros decimales
    //Se les añade una f, al final.

    var saldo :Float = 300.54f

    //Los datos de tipo Double son un tipo de dato que usa mucho mas espacio de memoria que el resto.
    var sueldo = 464.82

    //Los enteros no admiten numeros decimales
    var entero :Int = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Los valores y las variables son different.
        val fecha = "14/09/2022"
        //Los strings cuantan con posiones fijas
        //           0123456789
        var nombre = "Orasio"
        var vip = false
        nombre = "Horacio"



        var saludo = "Holaa $nombre la fecha en la que empezaste a estudiar es $fecha tu saldo es de $saldo $"
        println(saludo)
        //println(moneda)


        //Los operates arithmetics son los mismo que en javascript
        //   +   -   %
        //Los operadores comparativos son los mismo que en javascript
        // == > <=
        //The operates conditions son los mismo que en javascript
        var precioVip = 350
        var rest = precioVip - saldo
        var mes = fecha.subSequence(3, 5).toString().toInt()
        if(vip == true) println("Bienvenido $nombre, te queremos mucho!! :D")
        else {
            if (rest <= 0){
                println("Buenos dias $nombre! Te recordamos que nuestro servicio vip esta disponible y cuentas con saldo suficiente para el :D")
            }else{
                println("Hola $nombre, paga el servicio vip. Con tu saldo actual te faltan $ $rest")
            }
        }
        when(mes){
            1,2,3 -> print("\n En otoño no tenemos ofertas")
            4,5,6 -> print("\n En invierno hay ofertas de hasta 5%")
            7,8,9 -> print("\n En primavera el precio por nuestro servicio vip es del 30%")
            10,11,12 -> print("\n En verano hay ofertas de hasta 10%")
        }

    }

}