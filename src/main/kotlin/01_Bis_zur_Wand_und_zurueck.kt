import de.github.dudrie.hamster.imperative.de.*

fun main() {
    starteBisZurWandSpiel(0)

    var schritte: Int = 0

    while (istVorDirFrei()) {
        laufe()
        schritte++
    }

    dreheUm()

    while (schritte > 0) {
        laufe()
        schritte--
    }

    stoppeSpiel()
}
