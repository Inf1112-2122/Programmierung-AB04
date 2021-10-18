import de.github.dudrie.hamster.imperative.de.*

var schritteHorizontal: Int = 0
var schritteVertikal: Int = 0
var richtung: Int = 3 // N: 0, O: 3, S: 2, W: 1

fun main() {
    starteWegDurchsTerritoriumSpiel()

    laufeUndZaehle()
    dreheNachLinksMitRichtung()

    while (!istAmStart()) {
        if (istRechtsEineWand()) {
            if (istVorDirFrei()) {
                laufeUndZaehle()
            } else {
                dreheNachLinksMitRichtung()
            }
        } else {
            dreheNachRechtsMitRichtung()
            laufeUndZaehle()
        }
    }

    sage("Ich bin wieder am Anfang.")
    stoppeSpiel()
}

fun laufeUndZaehle() {
    laufe()
    when (richtung) {
        0 -> schritteVertikal--
        1 -> schritteHorizontal--
        2 -> schritteVertikal++
        3 -> schritteHorizontal++
    }

//    if (richtung == 0) {
//        schritteVertikal--
//    } else if (richtung == 1) {
//        schritteHorizontal--
//    } else if (richtung == 2) {
//        schritteVertikal++
//    } else if (richtung == 3) {
//        schritteHorizontal++
//    }
}

fun istRechtsEineWand(): Boolean {
    dreheNachRechts()
    val istWand = !istVorDirFrei()
    dreheNachLinks()
    return istWand
}

fun dreheNachLinksMitRichtung() {
    dreheNachLinks()
    richtung = (richtung + 1) % 4
}

fun dreheNachRechtsMitRichtung() {
    repeat(3) {
        dreheNachLinksMitRichtung()
    }
}

fun istAmStart(): Boolean {
    return schritteHorizontal == 0 && schritteVertikal == 0
}
