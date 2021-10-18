import de.github.dudrie.hamster.imperative.de.*

fun main() {
    starteZiffernLegenSpiel(1)
    setzeSpielGeschwindigkeit(10f)

    val anzahlKoernerImMund: Int = ermittleKornAnzahlImMund()
    legeZahl(anzahlKoernerImMund)

    stoppeSpiel()
}

fun ermittleKornAnzahlImMund(): Int {
    var anzahlImMund: Int = 0

    while (!istDeinMundLeer()) {
        legeKornAb()
        anzahlImMund++
    }

    repeat(anzahlImMund) {
        sammleKornAuf()
    }

    return anzahlImMund
}

fun legeZahl(zahl: Int) {
    var rest: Int = zahl

    while (rest > 0) {
        val ziffer: Int = bestimmeLetzteZiffer(rest)
        legeZiffer(ziffer)
        rest = schneideLetzteZifferAb(rest)
        laufe()
    }
}


fun bestimmeLetzteZiffer(zahl: Int): Int {
    return zahl % 10
}

fun schneideLetzteZifferAb(zahl: Int): Int {
    return zahl / 10
}

fun legeZiffer(ziffer: Int) {
    repeat(ziffer) {
        legeKornAb()
    }
}
