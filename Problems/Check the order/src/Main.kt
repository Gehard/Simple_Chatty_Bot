fun main() {
    
    val count = readLine()!!.toInt()
    var num = readLine()!!.toInt()
    var condition = "YES"
    
    for (i in 1 until count) {
        
        val swap = readLine()!!.toInt()
        
        if (num > swap) condition = "NO" else num = swap
    }
    
    println(condition)
    
}
