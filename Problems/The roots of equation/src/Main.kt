fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    for (i in 0..1000) {
        val x = a * i * i * i + b * i * i + c * i + d
        if (x == 0) {
            println(i)
        }

    }
}
