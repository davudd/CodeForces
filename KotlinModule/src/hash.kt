import java.util.*

fun main() {
    var testCases = readLine()!!.toInt()
    for (i in 0..testCases) {
        val (n,x) = readLine()!!.split(" ").map { it.toInt() }
        val bottlesCapacity = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        var c = 0
        var capacity = 0
        val capacitiesMap:TreeMap<Int,Int> = TreeMap<Int,Int>()
        for (i in bottlesCapacity) {
            capacitiesMap[i] = i
        }
        for (entry in capacitiesMap) {
            capacity+=entry.key
            if (capacity <=  x) {
                c++
            }else break
        }
        println(c)
    }
}


