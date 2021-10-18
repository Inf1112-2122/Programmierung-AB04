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
    var gepruefteSeiten: Int = 0

    while (istDeinMundLeer() && gepruefteSeiten < 4) {
        pruefeSeite(kreisRadius)
        dreheNachLinks()
        gepruefteSeiten++
    }
}

fun pruefeSeite(kreisRadius: Int) {
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
