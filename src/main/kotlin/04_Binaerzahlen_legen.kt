import de.github.dudrie.hamster.imperative.de.*

fun main() {
    legeAlsBinaerzahl(5)
}

fun legeAlsBinaerzahl(dezimalzahl: Int) {
    starteBinaerSpiel()

    var aktuelleZahl = dezimalzahl

    while (aktuelleZahl > 0) {
        // TODO: A4 c)
    }

    stoppeSpiel()
}

fun bestimmeBinaerZiffer(zahl: Int): Int {
    TODO("A4 a)")
    return 0
}

fun bestimmeNaechsteZahl(vorherigeZahl: Int): Int {
    TODO("A4 b)")
}
