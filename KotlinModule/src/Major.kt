import kotlin.collections.Map.Entry
import kotlin.math.absoluteValue

fun main() {
    val numbers = arrayOf(3,2,3,3,3,4,2,5,6)
    val counts: HashMap<Int, Int> = HashMap()
    for (num in numbers) {
        if (counts.containsKey(num)) {
            counts[num] = counts[num]!!.absoluteValue + 1
        }
        else{
            counts[num] = 1
        }
    }
    println(counts)

    var majorEntry: Entry<Int, Int>? = null

    for (entry in counts.entries) {
        if (majorEntry == null || entry.value > majorEntry.value) {
            majorEntry = entry
        }
    }

    println(majorEntry!!.key)

}
