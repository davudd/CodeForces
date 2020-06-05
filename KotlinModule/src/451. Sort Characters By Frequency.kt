import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.Map.Entry
import kotlin.math.absoluteValue

fun main() {
    val str = "Aabb"
    val output = StringBuilder("")
    val hashMap = HashMap<Char, Int>()
       for (i in str) {
        if (hashMap.containsKey(i)) {
            hashMap[i] = hashMap[i]!! + 1
        }else{
            hashMap[i] = 1
        }
    }
    for (entry in hashMap.entries.sortedByDescending { it.value }) {
        for (i in 0 until entry.value) {
            output.append(entry.key)
        }
    }
    print(output.toString())
}