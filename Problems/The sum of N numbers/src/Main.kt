fun main() {
    val n = readLine()!!.toInt()
    var y = 0
    repeat(n) {
        val x = readLine()!!.toInt()
        y += x
    }

    println(y)
}