import java.util.*
import kotlin.collections.ArrayList

class ArrayListType: NewType {
    var array = ArrayList<Int>()

    override fun addElement(t: Int) {
        array.add(t)
    }

    override fun getHead(): Int {
        return array[0]
    }

    override fun pop() {
        array.removeAt(0)
    }

    override fun getSize():Int {
        return array.size
    }

    override fun getMax(): Int {
        return Collections.max(array)
    }

}