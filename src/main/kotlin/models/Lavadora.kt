package models

class Lavadora:Electrodomestico {
    private var carga:Int=5
    constructor(idProducto:String,
                precioBase:Float,
                color:String,consumo:
                Consumo,peso:Float,
                carga:Int):super(idProducto, precioBase, color, consumo, peso){
        this.carga=carga
    }


    private fun precioCarga():Float{
        when (carga) {
            6, 7 -> precioBase+=55
            8 -> precioBase+=70
            9 -> precioBase+=85
            10 -> precioBase+=100
        }
        return precioBase
    }
    override fun gettprecioFinal(): Float {
        var precioFinal=0.0f
        return super.precioBase+precioPeso()+precioConsumo()+precioCarga()
    }

    override fun mostrarPrecioFinal(){
        println("Producto -> ${this.idProducto}\nPrecio Base -> ${this.precioBase}\nColor -> ${this.color}\nConsumo -> ${this.consumo}\nPeso -> ${this.peso}\n Carga -> ${this.carga}")
    }
}