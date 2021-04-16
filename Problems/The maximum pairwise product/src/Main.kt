fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for (i in 1..n) {
        val x = readLine()!!.toInt()
        list.add(x)
        list.sortDescending()

    }
    if (list.size == 1) {
        println(list[0])
    } else {
        println(list[0] * list[1])
    } 

}
