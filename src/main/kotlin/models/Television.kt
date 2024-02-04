package models


class Television(precioBase: Float, private var pulgadas: Int) : Electrodomestico(precioBase) {
    init {
        this.pulgadas = pulgadas
    }

    override fun precioFinal(): Float {
        precioConsumo()
        when {
            pulgadas in 21..32 -> precioBase += 50
            pulgadas in 32..42 -> precioBase += 100
            pulgadas in 42..51 -> precioBase += 150
            pulgadas > 51 -> precioBase += 200
        }
        return precioBase
    }
}
