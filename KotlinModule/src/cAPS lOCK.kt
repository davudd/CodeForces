import java.lang.StringBuilder

fun main() {
    var str = readLine().toString()
    val wordsArr: Array<String> = str.split(" ").toTypedArray()
    var finalString = StringBuilder()
    wordsArr.forEach { word ->
        when {
            allIsUp(word) -> {
                finalString.append(str.toLowerCase())
            }
            check(word) -> finalString.append(switch(word))
            else -> finalString.append(word)
        }
    }
    println(finalString.toString())
}

fun allIsUp(word: String): Boolean {
    var allIsUp = true
    word.forEachIndexed { index, _ ->
        if (word[index].isLowerCase()) {
            allIsUp = false
        }
    }
    return allIsUp
}

fun check(string: String):Boolean {
    if (string[0] == string[0].toLowerCase()) {
        var rule2 = true
        for (c in 1 until string.length) {
            if (string[c] == string[c].toLowerCase()){
                rule2 = false
            }
        }
        return rule2
    }else return false
}



fun switch(str: String): String{
    var sb = StringBuilder()
    for (i in str) {
        sb.append(changeCase(i))
    }
    return sb.toString()
}

fun changeCase(char: Char): Char {
    return if (char.isUpperCase())
        char.toLowerCase()
    else
        char.toUpperCase()
}

