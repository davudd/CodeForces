fun main() {
    val k = readLine()!!.toInt()
    for (j in 1..k) {
        var (m, n) = readLine()?.split(" ")!!.map(String::toInt)
        for (i in 1..n) {
            m = m+  findSmallestDivisor(m) //2
        }
        println(m)
    }
}


fun findSmallestDivisor(m: Int): Int {
    for (i in 2..m) {
        if (m % i == 0) {
            return i
        }
    }
    return 0
}

