
fun main() {
    //max length str without repeating chars
    val input = "abcabcad"
    val hashSet = HashSet<Char>()
    var max = 0
    var a = 0
    for (c in input) {
        if (!hashSet.contains(c)) {
            hashSet.add(c)
            max = kotlin.math.max(hashSet.size, max)
        }else{
            hashSet.remove(input.elementAt(a))
            a++
        }
    }
    print(max)
}