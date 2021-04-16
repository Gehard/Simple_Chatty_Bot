fun divide(x: Long, y: Long): Double = x.toDouble() / y
/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}