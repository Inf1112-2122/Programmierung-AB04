import de.github.dudrie.hamster.imperative.de.*

fun main() {
    legeAlsBinaerzahl(5)
}

fun legeAlsBinaerzahl(dezimalzahl: Int) {
    starteBinaerSpiel()

    var aktuelleZahl = dezimalzahl

    while (aktuelleZahl > 0) {
        val ziffer = bestimmeBinaerZiffer(aktuelleZahl)
        if (ziffer == 1) {
            legeKornAb()
        }
        if (istVorDirFrei()) {
            laufe()
        }
        aktuelleZahl = bestimmeNaechsteZahl(aktuelleZahl)
    }

    stoppeSpiel()
}

fun bestimmeBinaerZiffer(zahl: Int): Int {
    return zahl % 2
}

fun bestimmeNaechsteZahl(vorherigeZahl: Int): Int {
    return vorherigeZahl / 2
}
