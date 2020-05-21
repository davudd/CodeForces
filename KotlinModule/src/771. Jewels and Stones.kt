import kotlin.math.absoluteValue

fun main(){
    val J = "z"
    val S = "ZZ"
    val map:HashMap<Char,Int> = HashMap()
    for (char in S) {
        if (!map.containsKey(char)) {
            map[char] = 1
        }else{
            map[char] = map[char]!! + 1
        }
    }
    var res = 0
    for (char in J){
        if (map.containsKey(char)) {
            res += map[char]!!
        }
    }

    print(res)
}