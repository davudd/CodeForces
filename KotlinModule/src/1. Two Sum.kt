fun main() {
    val nums: IntArray = intArrayOf(3,3)  // 6  8  1
    val target = 6
    val hashMap = HashMap<Int, Int>()
    for (i in nums.indices) {
        if(nums[i] <= target) {
            hashMap[i] = nums[i]
        }
    }
    var remainVal = hashMap.entries.map { it.value }.toIntArray()
    var remainIndices = hashMap.entries.map { it.key }.toIntArray()
    var res = intArrayOf(-1,-1)

    var i = 0
    for (r in remainVal.indices) {
        for (j in r + 1 until remainVal.size) {
            var sum = remainVal[r] + remainVal[j]
            if (sum == target) {
                res[0] = remainIndices[r]
                res[1] = remainIndices[j]
            }
        }
    }

    for (i in res) {
        println(i)
    }
}