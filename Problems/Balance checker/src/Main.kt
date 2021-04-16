fun main() {
    var amount = readLine()!!.toInt()
    val amt = readLine()!!
    val delim = " "
    val l = amt.split(delim).toMutableList()

    for (i in 0 until l.count()) {
        if (amount >= l[0].toInt() && l.count() > 0) {
            amount -= l[0].toInt()
            l.removeAt(0)
            if (l.count() == 0) {
                println("Thank you for choosing us to manage your account! You have $amount money.")
            }
        } else if (amount < l[0].toInt()) {
            println("Error, insufficient funds for the purchase. You have $amount, but you need ${l[0].toInt()}.")
        }
    }
}

/**
 *
fun main() {
var have = readLine()!!.toInt()
var need = 0
println(readLine()!!
.split(" ")
.asSequence()
.map(String::toInt)
.runningFold(have) { acc, i -> have = acc; need = i; acc - i }
.firstOrNull { it < 0 } // Does not calculate all purchases if you have "money" <0
?.let { "Error, insufficient funds for the purchase. You have $have, but you need $need." }
?: "Thank you for choosing us to manage your account! You have ${have - need} money.")
}
 *
 **/