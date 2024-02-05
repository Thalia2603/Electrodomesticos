package controllers

import models.Electrodomestico
import models.Lavadora
import models.Television
import utilities.*
import java.security.Principal

fun calcularPrecioBaseElectrodomesticos(array:Array<Electrodomestico>):Double{
    var precio=0.0
    for (electrodomestico in array){
        precio+=electrodomestico.gettPrecioBase()
    }
    return precio
}

fun calcularPrecioFinalElectrodomesticos(array: Array<Electrodomestico>):Double{
    var precio=0.0
    for (electrodomestico in array){
        precio+=electrodomestico.gettprecioFinal()
    }
    return precio
}

fun calcularPrecioBaseLavadoras(array: Array<Electrodomestico>):Double{
    var precio=0.0
    for(lavadora in array){
        if (lavadora is Lavadora){
            precio+=lavadora.gettPrecioBase()
        }
    }
    return precio
}

fun calcularPrecioFinalLavadoras(array: Array<Electrodomestico>):Double{
    var precio=0.0
    for (lavadora in array){
        if (lavadora is Lavadora){
            precio+=lavadora.gettprecioFinal()
        }
    }
    return precio
}


fun calcularPrecioBaseTelevisiones(array: Array<Electrodomestico>):Double{
    var precio=0.0
    for (television in array){
        if (television is Television){
            precio+=television.gettPrecioBase()
        }
    }
    return precio
}

fun calcularPrecioFinalTelevisiones(array: Array<Electrodomestico>):Double{
    var precio=0.0
    for (television in array){
        if (television is Television){
            precio+=television.gettprecioFinal()
        }
    }
    return precio
}

fun mostrarResultados(
    pbTV: Double,
    pbLav: Double,
    pbElec: Double,
    pfTV: Double,
    pfLav: Double,
    pfElec: Double
){
    println("\n$RED_BACKGROUND ------RESULTADOS GLOBALES------ $RESET")
    println("\n$BLUE_BACKGROUND Electrodomésticos $RESET")
    println("Precio Base -> $pbElec€")
    println("Precio Total -> $pfElec€")
    println("\n$GREEN_BACKGROUND Lavadoras $RESET")
    println("Precio Base -> $pbLav€")
    println("Precio Total -> $pfLav€")
    println("\n$YELLOW_BACKGROUND Televisores $RESET")
    println("Precio Base -> $pbTV€")
    println("Precio Total -> $pfTV€")
}