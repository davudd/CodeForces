fun main() {
    val n = readLine()!!.toInt()
    var list: List<Int> = readLine()?.split(" ")!!.map(String::toInt)
    list = list.sortedDescending()
    var taxi = 0
    var expect: Int? = null
    for (i in list.indices) {
        if (expect != i) {
            val l = 4 - list[i]  //1
            if (l == 0) {
                taxi++
            } else {
                var enter = true
                for (i2 in list.indices) {
                    if (expect != i2) {
                        if (enter) {
                            if (l == list[i2]) {
                                expect = i2
                                enter = false
                                taxi++
                            }
                        }}
                }
            }
        }
    }
    println(taxi)
}
