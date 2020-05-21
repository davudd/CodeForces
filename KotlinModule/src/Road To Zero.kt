

fun main() {
    val k = readLine()!!.toInt()
    for (j in 1..k) {
        var (x, y) = readLine()?.split(" ")!!.map(String::toInt)
        val (a, b) = readLine()?.split(" ")!!.map(String::toInt)
        var spentMoney = 0

        while (x > 1) {
            x--
            spentMoney += a
        }

        while (y > 1) {
            y--
            spentMoney += a
        }

        if (x != 0 && y != 0)
            spentMoney += b

        println(spentMoney)
    }
}
