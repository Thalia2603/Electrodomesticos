package models

import utilities.RESET
import utilities.YELLOW_BACKGROUND

class Television :Electrodomestico{
    private var pulgadas:Int=28
    constructor(idProducto:String,
                precioBase: Double,
                color:String, consumo: Consumo,
                peso: Double,
                pulgadas: Int):super(idProducto, precioBase, color, consumo, peso){
        this.pulgadas=pulgadas
    }

    override fun gettprecioFinal(): Double {
        var preciFinal=precioBase
        return precioBase+precioConsumo()+precioPeso()+precioPulgadas()
    }

    private fun precioPulgadas():Double{
        return when{
            this.pulgadas > 51 -> 200.0
            this.pulgadas > 42 -> 150.0
            this.pulgadas > 32 -> 100.0
            this.pulgadas > 29 -> 50.0
            else -> 0.0
        }
    }

    override fun toString():String {
        return "\n${YELLOW_BACKGROUND}Producto -> ${this.idProducto}$RESET\nPrecio Base -> ${this.precioBase}€\nColor -> ${this.color}\nConsumo -> ${this.consumo}\nPeso -> ${this.peso}\nPulgadas -> ${this.pulgadas}\nPrecio Final -> ${this.gettprecioFinal()}€"
    }

}