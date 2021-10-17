import de.github.dudrie.hamster.imperative.de.dreheNachLinks

fun dreheUm() {
    repeat(2) {
        dreheNachLinks()
    }
}

fun dreheNachRechts() {
    repeat(3) {
        dreheNachLinks()
    }
}
