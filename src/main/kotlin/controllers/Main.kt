package controllers
import models.Consumo
import models.Lavadora


fun main() {
    val lavadora = Lavadora(
        precioBase = 600.0f,
        color = "Blanco",
        consumo = Consumo.A,
        peso = 15.0f,
        carga = 8.0f
    )
    lavadora.mostrarPrecioFinal()
}
