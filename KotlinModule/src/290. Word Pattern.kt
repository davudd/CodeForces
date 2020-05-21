fun wordPattern(pattern: String, str: String):Boolean{
    val words = str.split(" ").toTypedArray()
    if (words.size != pattern.length) {
        return false
    }
    val map : HashMap<Char,String> = HashMap()
    for (i in pattern.indices) {
        val char = pattern[i]
        if (map.containsKey(char)) {
            if (map[char] != words[i]){
                return false
            }
        } else {
            if (map.containsValue(words[i])) {
                return false
            }
            map[char] = words[i]
        }
    }
    return true
}