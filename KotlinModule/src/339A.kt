import java.lang.StringBuilder

fun main() {
    val str  = readLine()!!
    var array: List<Int>

    array = str.filter { it.isDigit() }.map{Character.getNumericValue(it)}.toList()

    array = array.sorted()

    var newStr = StringBuilder()
    array.forEach {
        newStr.append("$it+")
    }.toString()

    newStr = newStr.deleteCharAt(newStr.length -1)
    println(newStr)
}
