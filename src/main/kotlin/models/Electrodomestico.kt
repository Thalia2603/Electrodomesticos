package models

enum class Consumo{
    A,B,C,D,E,F,G
}

open class Electrodomestico(
    var precioBase: Float,
    private var color: String = "Blanco",
    private var consumo: Consumo=Consumo.G,
    private var peso: Float = 5.0f
) {

    fun settConsumo(consumoActualizado:Consumo){
        this.consumo=consumoActualizado
    }

    fun settPeso(pesoActualizado:Float){
        this.peso=pesoActualizado
    }

    public fun precioConsumo(){
        when(consumo) {
            Consumo.A -> precioBase += 35
            Consumo.B -> precioBase += 30
            Consumo.C -> precioBase += 25
            Consumo.D -> precioBase += 20
            Consumo.E -> precioBase += 15
            Consumo.F -> precioBase += 10
            Consumo.G -> precioBase += 0
        }
    }

    public open fun precioPeso(){
        when{
            peso in 6.0..20.0 -> precioBase+=20
            peso in 20.0..50.0 -> precioBase+=50
            peso in 50.0..80.0 -> precioBase+=80
            peso > 80 -> precioBase+=100
        }
    }

    public open fun precioFinal():Float{
        precioConsumo()
        precioPeso()
        return precioBase
    }

    fun mostrarPrecioFinal(){
        println("El precio final es: ${precioFinal()} €")
    }

}

class Lavadora(precioBase: Float) : Electrodomestico(precioBase) {
    private var carga:Float=5.0f

    override fun precioPeso(){
        when {
            carga in 6.0..7.0-> precioBase+=55
            carga in 7.0..8.0 -> precioBase+=70
            carga in 8.00..9.0 -> precioBase+=85
            carga > 10.0 -> precioBase+=100
        }
        super.precioPeso()
    }

    override  fun precioFinal():Float{
        precioConsumo()
        precioPeso()
        return  precioBase
    }
}

class Television(precioBase: Float) : Electrodomestico(precioBase) {
    private var pulgadas:Int=28

    fun precioPulgadas(){
        when{
            pulgadas in 21..32 -> precioBase+=50
            pulgadas in 32..42 -> precioBase+=100
            pulgadas in 42..51-> precioBase+=150
            pulgadas>51 -> precioBase+=200
        }
    }

    override fun precioFinal(): Float {
        precioConsumo()
        precioPulgadas()
        return  precioBase
    }

}

