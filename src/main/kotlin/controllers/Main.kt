package controllers
import models.Consumo
import models.Electrodomestico
import models.Lavadora
import models.Television


fun main() {
    val arrayDeElectrodomesticos:Array<Electrodomestico> =arrayOf(
        Electrodomestico("Horno01", 250.0, "negro", Consumo.C, 15.0),
        Electrodomestico("Lavavajillas03", 350.0, "plateado", Consumo.A, 18.5),
        Electrodomestico("Aspiradora05", 120.0, "rojo", Consumo.B,8.0),
        Electrodomestico("Licuadora07", 80.0, "verde", Consumo.D, 3.5),
        Electrodomestico("Cafetera09", 60.0, "blanco", Consumo.E, 1.8),
        Electrodomestico("Tostadora11", 40.0, "gris", Consumo.G, 1.2),
        Television("LGTV32", 600.0, "negro", Consumo.F, 20.0, 32),
        Television("PanasonicTV42", 800.0, "plateado", Consumo.B, 25.0, 42),
        Lavadora("WhirlpoolLavadora", 450.0, "blanco", Consumo.G, 30.0, 10),
        Lavadora("BoschLavadora", 500.0, "plateado", Consumo.D, 35.0, 12)
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
