fun main() {
    val firstLetter: Char = readLine()!!.first()
    val secondLetter: Char = readLine()!!.first()
    val thirdLetter: Char = readLine()!!.first()

    println(firstLetter + 1 == secondLetter && secondLetter + 1 == thirdLetter)

}