val PI: Double = 3.14

fun main() {
    val summandA: Int = 5
    val summandB: Int = -8
//    val summe: Int = summandA + summandB
    val summe: Int = berechneSumme(summandA, summandB)
    println("$summandA + $summandB = $summe")

    val maximum: Int = findeMaximum(123, 1045)
    println("Das Maximum ist $maximum")

    val summeBis50: Int = summiereErsteNZahlen(50)
    println("Die Summe der ersten 50 Zahlen ist $summeBis50")

    val radius: Double = 4.0
    val kreisflaeche: Double = berechneKreisflaeche(radius)
    println("Ein Kreis mit dem Radius $radius cm hat eine Fläche von ca. $kreisflaeche cm^2 (Rechnung: $radius * $radius * $PI = $kreisflaeche).")
}

fun berechneSumme(erster: Int, zweiter: Int): Int {
    val summe: Int = erster + zweiter
    return summe
}

fun findeMaximum(zahl1: Int, zahl2: Int): Int {
    var maximum: Int = zahl1

    if (zahl2 > zahl1) {
        maximum = zahl2
    }

    return maximum
}

fun summiereErsteNZahlen(n: Int): Int {
    var summe: Int = 0

    for (i in 1..n) {
        // summe = summe + i
        summe += i
    }

    return summe
}

fun berechneKreisflaeche(radius: Double): Double {
    val flaeche = radius * radius * PI
    return flaeche
}
