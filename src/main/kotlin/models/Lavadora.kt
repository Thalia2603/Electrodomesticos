package models

class Lavadora(precioBase: Float, carga: Float, color: String, consumo: Consumo, peso: Float) : Electrodomestico(precioBase) {
    init {
        this.peso = carga
    }

    override fun precioPeso() {
        when {
            peso in 6.0..7.0 -> precioBase += 55
            peso in 7.0..8.0 -> precioBase += 70
            peso in 8.0..9.0 -> precioBase += 85
            peso > 10.0 -> precioBase += 100
        }
        super.precioPeso()
    }

    override fun precioFinal(): Float {
        precioConsumo()
        precioPeso()
        return precioBase
    }
}
