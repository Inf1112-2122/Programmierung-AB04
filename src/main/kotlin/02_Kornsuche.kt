import de.github.dudrie.hamster.imperative.de.*

fun main() {
    starteKornsucheSpiel(1)
    setzeSpielGeschwindigkeit(10f)

    var radius: Int = 1

    while (istDeinMundLeer()) {
        pruefeKreis(radius)
        radius++
    }

    stoppeSpiel()
}

fun pruefeKreis(kreisRadius: Int) {
    var anzahl: Int = 0

    while (istDeinMundLeer() && anzahl < 4) {
        pruefeReihe(kreisRadius)
        dreheNachLinks()
        anzahl++
    }
}

fun pruefeReihe(kreisRadius: Int) {
    var kornGefunden: Boolean = false
    var schritte: Int = 0

    while (!kornGefunden && schritte < kreisRadius && istVorDirFrei()) {
        laufe()
        schritte++

        if (liegtEinKornAufDeinemFeld()) {
            kornGefunden = true
            sammleKornAuf()
        }
    }
}
