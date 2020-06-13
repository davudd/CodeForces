import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main() {
    val nums = intArrayOf(1,-1)

    var index = 0
    val hashMap = HashMap<Int, Int>()
    val output = ArrayList<Int>()
    var i = 0

    while (i < nums.size) {
        if (hashMap.size == 1) {
            hashMap.remove(index)
            hashMap[i] = nums[i]
            index++
        } else {
            hashMap[i] = nums[i]
            i++
        }

        if (hashMap.size == 1)
        output.add(Collections.max(hashMap.map { it.value }))


    }
    print(output)
}