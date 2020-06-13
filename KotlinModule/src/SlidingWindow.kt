//Find max subarray never repeating
fun main() {
    val arr = intArrayOf(4, 2, 43, 7, 8, 4, 2, 8, 1, 0)
    var sum = 0
    var max = 0
    var index = 0
    val hashMap = HashMap<Int,Int>()
    for (i in arr.indices) {
        sum += arr[i]
        if (hashMap.size == 3) {
            sum -= arr[index]
            hashMap.remove(index)
            hashMap[i] = arr[i]
            index ++
        }else{
            hashMap[i] = arr[i]
        }
        max = kotlin.math.max(sum,max)
    }
    print(max)
}