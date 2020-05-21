fun main(){
    var n = readLine()!!.toInt()
    for (i in 1..n){

        var (house,money) = readLine()!!.split(" ").map { it.toInt() }

        val prices: Array<Int> = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        prices.sort()

        var count = 0

        for (j in prices.indices){
            money -= prices[j]
            if (money<0)
                break
            count ++

        }

        println("Case #$i: $count")

    }
}


fun bruteForceAll(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        if (i != array.lastIndex)
            for (j in i + 1 until array.size) {
                if (array[j] < array[i]) {
                    val temp: Int = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
    }
    return array
}