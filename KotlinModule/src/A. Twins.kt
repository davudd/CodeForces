    fun main() {
        val n = readLine()!!.toInt()
        val arr: Array<Int> = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        bruteForceSort(arr)
        var pairCount = 0
        var pairSum = 0
        var arrSum = 0
        for (i in arr.indices) {
            arrSum += arr[i]
        }
        for (i in arr.indices) {
            pairSum += arr[i]
            pairCount++
            if (pairSum  > arrSum/2)
                break
        }
        println(pairCount)

    }

    fun bruteForceSort(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            if (i != array.lastIndex)
                for (j in i + 1 until array.size) {
                    if (array[i] < array[j]) {
                        val temp: Int = array[j]
                        array[j] = array[i]
                        array[i] = temp
                    }
                }
        }
        return array
    }