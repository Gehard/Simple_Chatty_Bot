fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val resNum = input.first().toInt()
    val isItWeekend = input.last().toBoolean()

    val result = isItWeekend && resNum in 15..25 || !isItWeekend && resNum in 10..20
    println(result)
}