class BubbleSort {
    fun sort(array: IntArray){
        for (j in array.indices)
        for (i in j..array.size-2){
            if (array[i]>array[i+1]){
                val temp = array[i+1]
                array[i+1] = array[i]
                array[i] = temp
            }
            for (j in array.indices){
                print("${array[j]}\t")
            }
            print("\n")
        }

    }
}

fun main(){
    val sort = BubbleSort()
    sort.sort(intArrayOf(4,1,42,23,2,3,4,5,6))
//    4,1,42,23,2,3,4,5,6
//    1,4,42,23,2,3,4,5,6
}