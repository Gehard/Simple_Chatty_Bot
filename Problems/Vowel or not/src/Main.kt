fun isVowel(ch: Char): Boolean = ch.toUpperCase() in "AEIOU"

fun main() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}