import java.util.*
import kotlin.collections.HashMap
import kotlin.math.absoluteValue

fun main() {
    swap()
    bruteForce()
}


fun swap(){
    val start:Long = System.currentTimeMillis()
    val array = arrayOf(1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45)
    array.sortDescending()
    print("native end ${System.currentTimeMillis()-start}")
    array.forEach { println("$it ") }
}



fun bruteForce() {
    val start:Long = System.currentTimeMillis()
    val array = arrayOf(1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,21,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45,1,5,23,45,1,2,45)
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
    print("bruteForce end ${System.currentTimeMillis()-start}") //17 360
    array.forEach { println("$it ") }
}