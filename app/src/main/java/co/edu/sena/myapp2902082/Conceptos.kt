fun main() {
    // Monto de la inversión total inicial del proyecto
    val I0 = 50000.0  // Ejemplo: 50,000 unidades monetarias

    // Ejemplo de flujo de caja proyectado por 5 años
    val flujoCaja = listOf(12000.0, 15000.0, 18000.0, 20000.0, 25000.0)

    // Calcular la rentabilidad total
    val rentabilidadTotal = calcularRentabilidad(I0, flujoCaja)

    println("La rentabilidad total del proyecto es: $rentabilidadTotal unidades monetarias")
}

fun calcularRentabilidad(I0: Double, flujoCaja: List<Double>): Double {
    return flujoCaja.sum() - I0




    fun main1() {
        val I0 = 50000.0
        val flujoCaja = listOf(12000.0, 15000.0, 18000.0, 20000.0, 25000.0)

        val rentabilidadTotal = calcularRentabilidad(I0, flujoCaja)
        println("La rentabilidad total del proyecto es: $rentabilidadTotal unidades monetarias")
    }

    fun calcularRentabilidad(I0: Double, flujoCaja: List<Double>): Double {
        return flujoCaja.sum() - I0
    }




    const val IVA = 0.21  // 21% de IVA
    const val DESCUENTO_MAXIMO = 0.15  // 15% de descuento máximo
    const val CANTIDAD_MAXIMA_PRODUCTOS = 100  // Cantidad máxima de productos permitidos

    fun main2() {
        val precioBase = 100.0
        val totalConIva = calcularTotalConIva(precioBase)
        val descuentoAplicado = aplicarDescuento(precioBase, 0.10)  // 10% de descuento

        println("Precio base: $precioBase")
        println("Total con IVA: $totalConIva")
        println("Precio después del descuento: $descuentoAplicado")
    }

    fun calcularTotalConIva(precio: Double): Double {
        return precio * (1 + IVA)
    }

    fun aplicarDescuento(precio: Double, descuento: Double): Double {
        if (descuento > DESCUENTO_MAXIMO) {
            println("El descuento excede el máximo permitido, se aplicará el máximo.")
            return precio * (1 - DESCUENTO_MAXIMO)
        }
        return precio * (1 - descuento)
    }



    fun main3() {
        val nombre: String? = obtenerNombre() // Puede ser nulo
        val saludo = crearSaludo(nombre)
        println(saludo)
    }

    fun obtenerNombre(): String? {
        // Simulando una función que puede devolver un nombre o nulo
        return if (Math.random() > 0.5) "Juan" else null
    }

    fun crearSaludo(nombre: String?): String {
        // Manejo de nulos con el operador Elvis (?:)
        return "Hola, ${nombre ?: "invitado"}!"
    }
