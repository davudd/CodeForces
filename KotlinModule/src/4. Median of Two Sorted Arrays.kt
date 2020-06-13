fun main() {
    val array1 = intArrayOf(1, 3)
    val array2 = intArrayOf( 2)

    var array = array1 + array2
    array = array.sortedArray()
    val median: Float
    val size = array.size //8
    if (size % 2 == 0) {
        median = (array[(size -1)/2] + array[size/2])/ 2.0.toFloat()
    } else {
        median = array[size/2].toFloat()
    }
    print(median)
}