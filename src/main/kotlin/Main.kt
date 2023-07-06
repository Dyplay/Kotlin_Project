fun main(args: Array<String>) {
    val textEins = "Hallo Welt"
    val textZwei = "Guten Morgen"
    println(textEins + "\n" + textZwei)

    var textDrei: String
    textDrei = "Guten Abend"

    var textVier = textZwei
    val textFuenf = ", wie"
    textVier += textFuenf
    textVier += " geht es?"
    println("$textDrei\n$textVier")
}