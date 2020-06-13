fun main() {

    val temp: NewType = ArrayListType()

    val nums = intArrayOf(1,3,-1,-3,5,3,6,7)

    for (i in nums.indices) {
        temp.addElement(nums[i])
        if (temp.getSize() / 3 == 1) {
            temp.pop()
            temp.addElement(nums[i])
        }
        print(temp.getMax())
    }


}