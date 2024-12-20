fun main() {
    do {
        println("\nSeleccione una opción para calcular el área:")
        println("1. Cuadrado")
        println("2. Círculo")
        println("3. Triángulo")
        println("4. Salir")

        print("Ingrese su opción (1-4): ")
        val input = readLine() 
        val opcion = input?.toIntOrNull() ?: -1 

        when (opcion) {
            1 -> {
                println("Has elegido calcular el área de un cuadrado.")
                print("Ingrese la longitud del lado: ")
                val lado = readLine()?.toDoubleOrNull()
                if (lado != null && lado > 0) {
                    val areaCuadrado = lado * lado
                    println("El área del cuadrado es: $areaCuadrado")
                } else {
                    println("Por favor, ingrese un valor válido para el lado.")
                }
            }
            2 -> {
                println("Has elegido calcular el área de un círculo.")
                print("Ingrese el radio del círculo: ")
                val radio = readLine()?.toDoubleOrNull()
                if (radio != null && radio > 0) {
                    val areaCirculo = Math.PI * radio * radio
                    println("El área del círculo es: $areaCirculo")
                } else {
                    println("Por favor, ingrese un valor válido para el radio.")
                }
            }
            3 -> {
                println("Has elegido calcular el área de un triángulo.")
                print("Ingrese la base del triángulo: ")
                val base = readLine()?.toDoubleOrNull()
                print("Ingrese la altura del triángulo: ")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && altura != null && base > 0 && altura > 0) {
                    val areaTriangulo = (base * altura) / 2
                    println("El área del triángulo es: $areaTriangulo")
                } else {
                    println("Por favor, ingrese valores válidos para la base y la altura.")
                }
            }
            4 -> println("Saliendo del programa. ¡Hasta luego!")
            else -> println("Por favor, ingrese una opción válida.")
        }
    } while (opcion != 4)
}
