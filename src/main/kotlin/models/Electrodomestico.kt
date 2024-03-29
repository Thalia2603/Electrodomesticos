package models

import utilities.BLUE_BACKGROUND
import utilities.RESET



open class Electrodomestico(
    protected var idProducto:String="",
    protected var precioBase: Double,
    protected var color: String = "blanco",
    protected var consumo: Consumo = Consumo.G,
    protected var peso: Double = 5.0

) {
    //getters y setters
    fun settPrecioBase(precioBase: Double){
        this.precioBase=precioBase
    }
    fun settColor(color: String){
        val arrayColores= arrayOf("blanco","plateado","color")
        if(arrayColores.indexOf(color.lowercase())!=-1) {
            this.color=color
        }
    }
    fun gettPrecioBase():Double{
        return this.precioBase
    }
    open fun gettprecioFinal(): Double {
        var precioFinal=0.0
        precioFinal=precioConsumo()+precioPeso()
        return precioFinal
    }
    //calculo precio segun el consumo/peso
    fun precioConsumo():Double{
        when (consumo) {
            Consumo.A -> precioBase += 35
            Consumo.B -> precioBase += 30
            Consumo.C -> precioBase += 25
            Consumo.D -> precioBase += 20
            Consumo.E -> precioBase += 15
            Consumo.F -> precioBase += 10
            Consumo.G -> precioBase += 0
        }
        return precioBase
    }
    open fun precioPeso():Double {
        when {
            peso in 6.0..20.0 -> precioBase += 20
            peso in 20.0..50.0 -> precioBase += 50
            peso in 50.0..80.0 -> precioBase += 80
            peso > 80 -> precioBase += 100
        }
        return precioBase
    }
    //funcion que retorna el resultado
    override fun toString(): String {
        return "\n${BLUE_BACKGROUND}Producto -> ${this.idProducto}$RESET\nPrecio Base -> ${this.precioBase}€\nColor -> ${this.color}\nConsumo -> ${this.consumo}\nPeso -> ${this.peso}\nPrecio Final -> ${this.gettprecioFinal()}€"
    }
}

