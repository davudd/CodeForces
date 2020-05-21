
fun main() {
    val hello = "hello"
    val str = readLine().toString() //hlelo
    var j = 0
    for (i in str){
        if (i == hello[j]){
            j++
        }
        if (j == 5)
            break
    }
    if (j == 5)
        println("YES")
    else println("NO")
}