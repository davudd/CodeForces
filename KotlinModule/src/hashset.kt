fun main() {
    val hashSet = HashSet<Int>()
    val arr = intArrayOf(1, 3, 3, 2, 1)
    var c = 0
    for (i in arr) {
        if (hashSet.add(i)) {
           c++
        }
    }
    print(hashSet)
    

}