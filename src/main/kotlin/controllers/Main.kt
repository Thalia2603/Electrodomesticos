package controllers
import models.Consumo
import models.Electrodomestico
import models.Lavadora
import models.Television


fun main() {
    val arrayDeElectrodomesticos:Array<Electrodomestico> =arrayOf(
        Electrodomestico("Horno01", 250.0f, "negro", Consumo.C, 15.0f),
        Electrodomestico("Lavavajillas03", 350.0f, "plateado", Consumo.A, 18.5f),
        Electrodomestico("Aspiradora05", 120.0f, "rojo", Consumo.B,8.0f),
        Electrodomestico("Licuadora07", 80.0f, "verde", Consumo.D, 3.5f),
        Electrodomestico("Cafetera09", 60.0f, "blanco", Consumo.E, 1.8f),
        Electrodomestico("Tostadora11", 40.0f, "gris", Consumo.G, 1.2f),
        Television("LGTV32", 600.0f, "negro", Consumo.F, 20.0f, 32),
        Television("PanasonicTV42", 800.0f, "plateado", Consumo.B, 25.0f, 42),
        Lavadora("WhirlpoolLavadora", 450.0f, "blanco", Consumo.G, 30.0f, 10),
        Lavadora("BoschLavadora", 500.0f, "plateado", Consumo.D, 35.0f, 12)
    )

   for (electrodomestico in arrayDeElectrodomesticos){
        println(electrodomestico)
    }

    val pbElectrodomestico= calcularPrecioBaseElectrodomesticos(arrayDeElectrodomesticos)
    val pfElectrodomestico= calcularPrecioFinalElectrodomesticos(arrayDeElectrodomesticos)

    val pbLavadora= calcularPrecioBaseLavadoras(arrayDeElectrodomesticos)
    val pfLavadora= calcularPrecioFinalLavadoras(arrayDeElectrodomesticos)

    val pbTelevision= calcularPrecioBaseTelevisiones(arrayDeElectrodomesticos)
    val pfTelevision= calcularPrecioFinalTelevisiones(arrayDeElectrodomesticos)

    mostrarResultados(pbTelevision,pbLavadora,pbElectrodomestico,pfTelevision,pfLavadora,pfElectrodomestico)

}
