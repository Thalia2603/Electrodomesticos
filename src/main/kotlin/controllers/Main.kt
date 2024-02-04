package controllers

import models.Consumo
import models.Electrodomestico
import models.Lavadora
import models.Television

fun main() {
    // Ejemplo de Electrodomestico
    val electrodomestico = Electrodomestico(precioBase = 500.0f, consumo = Consumo.C, peso = 15.0f)
    electrodomestico.mostrarPrecioFinal()

    // Ejemplo de Lavadora
    val lavadora = Lavadora(precioBase = 400.0f, color = "Blanco", consumo = Consumo.F, peso = 25.0f, carga = 85.0f)
    lavadora.mostrarPrecioFinal()
    // Ejemplo de Television
    val television = Television(precioBase = 800.0f, color = "Negro", consumo = Consumo.B, peso = 20.0f, pulgadas = 40)
    television.mostrarPrecioFinal()
}
