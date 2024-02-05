# Electrodomésticos

Aplicación básica de gestión de electrodomésticos de una tienda pequeña. Su funcionalidad es el cálculo de precio final/base del total de electrodomésticos/lavadoras/televisores.

## Diagrama UML

![diagrama](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/c5a3f7bb-d1ca-4d2e-83e3-661963a7cc0b)


    - @startuml

    package models {
          
        class Electrodomestico {
        --Atributos--
            - idProducto: String = ""
            - precioBase: Float
            - color: String = "blanco"
            - consumo: Consumo = G
            - peso: Float = 5.0f
        --Metodos--
            + settPrecioBase(precioBase: Float): void
            + settColor(color: String): void
            + gettPrecioBase(): Float
            + gettprecioFinal(): Float
            + precioConsumo(): Float
            + precioPeso(): Float
            + toString(): String
        }
    
        class Lavadora {
        --Atributos--
            - carga: Int = 5
        --Metodos--
            + Lavadora(idProducto: String, precioBase: Float, color: String, consumo: Consumo, peso: Float, carga: Int)
            + precioCarga(): Float
            + gettprecioFinal(): Float
            + toString(): String
        }
    
        class Television {
        --Atributos--
            - pulgadas: Int = 28
        --Metodos--
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

![primeraej](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/8e9827d3-ace5-44d3-b2d9-a5239392f852)


- Ejecución n2:
  
```kotlin
mostrarResultados(pbTelevision,pbLavadora,pbElectrodomestico,pfTelevision,pfLavadora,pfElectrodomestico)
```

![segundaej](https://github.com/Thalia2603/Electrodomesticos/assets/153110473/617ace4c-d12c-4a33-8348-20aca16c5d9b)


