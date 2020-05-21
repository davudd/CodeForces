//class MergeSort{
//
//    private fun merge(unsorted: Array<Int>,middle:Int, l: Int, r: Int){
//        val n1 = middle - l + 1 //4
//        val n2 = r - middle //3
//        val arrLeft = Array(n1){it}
//        val arrayRight = Array(n1){it}
//
//        for (i in 0 until  n1){
//            arrLeft[i] = unsorted[i]
//        }
//        for (i in 0..n2){
//            arrayRight[i] = arrayRight[]
//        }
//
//        arrayRigt[0] = unsorted[4]
//        arrayRigt[1] = unsorted[5]
//        arrayRigt[2] = unsorted[6]
//    }
//
//    fun sort(unsorted: Array<Int>, l: Int, r: Int) {
//        if (l < r) {
//            val middle = (l + r) / 2
//            merge(unsorted,middle,l, r)
//        }
//    }
//}
//
//fun main() {
//    val array = arrayOf(7, 32, 1, 45, 22, 13, 43) //7
//    val mergeSort = MergeSort()
//    mergeSort.sort(array, 0, array.size - 1)
//}