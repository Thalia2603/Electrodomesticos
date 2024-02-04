package controllers

import models.Electrodomestico
import models.Lavadora
import models.Television
import java.security.Principal

fun calcularPrecioBaseElectrodomesticos(array:Array<Electrodomestico>):Float{
    var precio:Float=0f
    for (electrodomestico in array){
        precio+=electrodomestico.gettPrecioBase()
    }
    return precio
}

fun calcularPrecioFinalElectrodomesticos(array: Array<Electrodomestico>):Float{
    var precio:Float=0f
    for (electrodomestico in array){
        precio+=electrodomestico.gettprecioFinal()
    }
    return precio
}

fun calcularPrecioBaseLavadoras(array: Array<Electrodomestico>):Float{
    var precio=0f
    for(lavadora in array){
        if (lavadora is Lavadora){
            precio+=lavadora.gettPrecioBase()
        }
    }
    return precio
}

fun calcularPrecioFinalLavadoras(array: Array<Electrodomestico>):Float{
    var precio=0f
    for (lavadora in array){
        if (lavadora is Lavadora){
            precio+=lavadora.gettprecioFinal()
        }
    }
    return precio
}

fun calcularPrecioBaseTelevisiones(array: Array<Electrodomestico>):Float{
    var precio=0f
    for (television in array){
        if (television is Television){
            precio+=television.gettPrecioBase()
        }
    }
    return precio
}

fun calcularPrecioFinalTelevisiones(array: Array<Electrodomestico>):Float{
    var precio=0f
    for (television in array){
        if (television is Television){
            precio+=television.gettprecioFinal()
        }
    }
    return precio
}

fun mostrarResultados(
    pbTV: Float,
    pbLav: Float,
    pbElec: Float,
    pfTV: Float,
    pfLav: Float,
    pfElec: Float
){
    println("------RESULTADOS GLOBALES------")
    println("Electrodomésticos")
    println("Precio Base -> $pbElec")
    println("Precio Total -> $pfElec")
    println("Lavadoras")
    println("Precio Base -> $pbLav")
    println("Precio Total -> $pfLav")
    println("Televisores")
    println("Precio Base -> $pbTV")
    println("Precio Total -> $pfTV")
}