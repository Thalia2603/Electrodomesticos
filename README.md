# Electrodomésticos

Aplicación basica de gestión de electrodomésticos de una tienda pequeña. Su funcionalidad es el cálculo de precio final/base del total de electrodomésticos/lavadoras/televisores

## Diagrama UML

![diagrama](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/44939ace-cd65-4fbb-8c55-71a437b3c7bd)

    - @startuml
    package models {
        class Electrodomestico {
            - idProducto: String = ""
            - precioBase: Float
            - color: String = "blanco"
            - consumo: Consumo = G
            - peso: Float = 5.0f
            + settPrecioBase(precioBase: Float): void
            + settColor(color: String): void
            + gettPrecioBase(): Float
            + gettprecioFinal(): Float
            + precioConsumo(): Float
            + precioPeso(): Float
            + toString(): String
        }
    
        class Lavadora {
            - carga: Int = 5
            + Lavadora(idProducto: String, precioBase: Float, color: String, consumo: Consumo, peso: Float, carga: Int)
            + precioCarga(): Float
            + gettprecioFinal(): Float
            + toString(): String
        }
    
        class Television {
            - pulgadas: Int = 28
            + Television(idProducto: String, precioBase: Float, color: String, consumo: Consumo, peso: Float, pulgadas: Int)
            + precioPulgadas(): Float
            + gettprecioFinal(): Float
            + toString(): String
        }
    
        Electrodomestico <|-- Lavadora
        Electrodomestico <|-- Television
    }
    
    @enduml
