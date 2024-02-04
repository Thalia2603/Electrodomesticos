# Electrodomésticos

Aplicación básica de gestión de electrodomésticos de una tienda pequeña. Su funcionalidad es el cálculo de precio final/base del total de electrodomésticos/lavadoras/televisores.

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

## Ejemplos de ejecución 

- Ejecución n1:

```kotlin
for (electrodomestico in arrayDeElectrodomesticos){
        println(electrodomestico)
```

![ejecución1](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/0c0cfd52-af88-47d6-9116-40d9b938a57e)

- Ejecución n2:
  
```kotlin
mostrarResultados(pbTelevision,pbLavadora,pbElectrodomestico,pfTelevision,pfLavadora,pfElectrodomestico)
```

![ejecución2](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/81691994-0cfc-41f9-b5fc-ec1dbab7c9f6)

