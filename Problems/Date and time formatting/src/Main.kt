fun main() {
    val time = ":"
    val date = "/"
    val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
    val (x, y, z) = readLine()!!.split(' ').map(String::toInt)

    println("$a$time$b$time$c $x$date$y$date$z")
}