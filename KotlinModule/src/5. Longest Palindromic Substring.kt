fun main() {
    val input = "babad"   //bajjab
    val hashSet = HashSet<Char>()
    var i = 0
    var leftIndex = 0
    var max = 0
    while (i < input.length) {
        if (hashSet.contains(input.elementAt(i))) {
            hashSet.remove(input.elementAt(leftIndex))
            leftIndex ++
            max = kotlin.math.max(hashSet.size,max)
        } else {
            hashSet.add(input.elementAt(i))
            i++
        }
    }
}