fun main() {
//    val input = arrayOf('A', 'A', 'A', 'H', 'H', 'B', 'C')

    val input = "abcabcbb"
    val hashSet = HashSet<Char>()
    var max = 0
    var indexOld = 0
    var i = 0

    while (i<input.length) {
        if (!hashSet.contains(input[i])) {
            hashSet.add(input[i])
            max = kotlin.math.max(hashSet.size, max)
            i++
        }
        else {
            hashSet.remove(input.elementAt(indexOld))
            indexOld++
        }

    }
    print(max)

}