import de.github.dudrie.hamster.imperative.de.starteSpiel

fun starteBisZurWandSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "leerer_gang"
        override val interval: IntRange = 0..3
    }, spielNummer)
}

fun starteKornsucheSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "kornsuche"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteZiffernLegenSpiel(spielNummer: Int) {
    starteSpielAusSpielMenge(object : SpielMenge {
        override val spielPrefix: String = "ziffern_legen"
        override val interval: IntRange = 0..2
    }, spielNummer)
}

fun starteBinaerSpiel() {
    starteSpiel("territories/binaergang")
}

fun starteWegDurchsTerritoriumSpiel() {
   starteSpiel("territories/startsuche_0")
}

private fun starteSpielAusSpielMenge(menge: SpielMenge, spielNummer: Int) {
    require(spielNummer in menge.interval) { "Die Spielnummer $spielNummer ist ungültig. Sie muss zwischen ${menge.interval.first} und ${menge.interval.last} liegen." }

    starteSpiel("territories/${menge.spielPrefix}_$spielNummer")
}

private interface SpielMenge {
    val spielPrefix: String
    val interval: IntRange
}
