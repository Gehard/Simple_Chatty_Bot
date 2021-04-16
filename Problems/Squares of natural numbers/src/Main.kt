fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var i = 1
    while (i * i <= n) {
        println(i * i)
        i++
    }
}