package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        //Las constantes no pueden estar junto a las demas variables
        const val moneda = "EUR"
    }
    var saldo :Float = 300.54f
    var sueldo :Float = 464.82f
    var entero :Int = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "14/09/2022"
        //Los strings cuantan con posiones fijas

        var nombre :String = "Orasio"
        var vip :Boolean = false
        nombre = "Horacio"


        ingresar_sueldo()



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
        var dia = fecha.subSequence(0, 2).toString().toInt()
        if(dia == 1)ingresar_sueldo()
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
            else -> print("\n La fecha es incorrecta")
        }

        //The operates logics son los mismo que en javascript
        // ||  &&


        //Bucles
        var pin: Int = 1234
        var intentos = 0
        var clave_ingresada: Int = 1232
        var authentication:Boolean = false
        do{
            println("Ingrese el PIN: ")
            println("Clave ingresada: ${clave_ingresada++}")
            if(clave_ingresada == pin) {
                authentication = true
                break
            }
            else{
                intentos++
                if(intentos == 3) {
                    println("Tarjeta bloqueada")
                }
            }
        }while(intentos < 3 && clave_ingresada != pin)

        if(authentication == true) println("Bienvenido has ingresado a tu cuenta")

        mostrar_saldo()
        ingresar_dinero(50.6f)
        retirar_dinero(40f)


        //Arrays
        //En un array se especifica el tipo de dato que contine dentro
        var recibos: Array<String> = arrayOf("luz", "agua", "gas")

        //Matriz, Conjunto de arrays
        var matriz = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)
        )

        recorrerArray(recibos)
    }

    fun mostrar_saldo(){
        println("Tienes $saldo ")
    }

    fun ingresar_sueldo(){
        saldo += sueldo
        println("tienes un sueldo de: $sueldo")
        mostrar_saldo()
    }

    fun ingresar_dinero(cantidad :Float){
        saldo += cantidad
        println("Se ha ingresado $cantidad")
        mostrar_saldo()
    }

    fun retirar_dinero(cantidad :Float){
        if(verficarCantidad(cantidad)){
            saldo -= cantidad
            println("Se ha hecho un retiro de  $cantidad")
            mostrar_saldo()
        }
        else println("No tienes suficiente saldo. Revisa la cantidad ingresada.")
    }

    fun verficarCantidad(cantidad: Float): Boolean {
        return cantidad < saldo
    }

    fun recorrerArray(array: Array<String>){
        for(i in array){
            println(i)
        }

        for(i in array.indices){
            println(array.get(i))
        }


        for(i in 0 .. array.size - 1){
            println("${i+1} ${array.get(i)} ")
        }
    }























}