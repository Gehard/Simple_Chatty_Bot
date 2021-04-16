fun main() {
    val ch: Char = readLine()!!.first()
    val ch2: Char = readLine()!!.first()

    println(ch.equals(ch2, ignoreCase = true))
}