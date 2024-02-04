package models

import utilities.RESET
import utilities.YELLOW_BACKGROUND

class Television :Electrodomestico{
    private var pulgadas:Int=28
    constructor(idProducto:String,
                precioBase: Float,
                color:String, consumo: Consumo,
                peso: Float,
                pulgadas: Int):super(idProducto, precioBase, color, consumo, peso){
        this.pulgadas=pulgadas
    }

    override fun gettprecioFinal(): Float {
        var preciFinal=precioBase
        return precioBase+precioConsumo()+precioPeso()+precioPulgadas()
    }

    private fun precioPulgadas():Float{
        return when{
            this.pulgadas > 51 -> 200f
            this.pulgadas > 42 -> 150f
            this.pulgadas > 32 -> 100f
            this.pulgadas > 29 -> 50f
            else -> 0f
        }
    }

    override fun toString():String {
        return "\n${YELLOW_BACKGROUND}Producto -> ${this.idProducto}$RESET\nPrecio Base -> ${this.precioBase}\nColor -> ${this.color}\nConsumo -> ${this.consumo}\nPeso -> ${this.peso}\nPulgadas -> ${this.pulgadas}"
    }

}