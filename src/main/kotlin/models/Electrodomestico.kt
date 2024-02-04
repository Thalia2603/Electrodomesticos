package models

enum class Consumo {
    A, B, C, D, E, F, G
}

open class Electrodomestico(
    protected var idProducto:String="",
    protected var precioBase: Float,
    protected var color: String = "blanco",
    protected var consumo: Consumo = Consumo.G,
    protected var peso: Float = 5.0f

) {
    //getters y setters
    fun settPrecioBase(precioBase: Float){
        this.precioBase=precioBase
    }
    fun settColor(color: String){
        val arrayColores= arrayOf("blanco","plateado","color")
        if(arrayColores.indexOf(color.lowercase())!=-1) {
            this.color=color
        }
    }
    fun gettPrecioBase():Float{
        return this.precioBase
    }
    open fun gettprecioFinal(): Float {
        var precioFinal=0.0f
        precioFinal=precioConsumo()+precioPeso()
        return precioFinal
    }
    //calculo precio segun el consumo/peso
    fun precioConsumo():Float{
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
    open fun precioPeso():Float {
        when {
            peso in 6.0..20.0 -> precioBase += 20
            peso in 20.0..50.0 -> precioBase += 50
            peso in 50.0..80.0 -> precioBase += 80
            peso > 80 -> precioBase += 100
        }
        return precioBase
    }
    //funcion que retorna el resultado
    fun mostrarPrecioFinal() {
        println("Producto -> ${this.idProducto}\nPrecio Base -> ${this.precioBase}\nColor -> ${this.color}\nConsumo -> ${this.consumo}\nPeso -> ${this.peso} ")
    }
}

