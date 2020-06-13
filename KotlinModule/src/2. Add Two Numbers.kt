import org.w3c.dom.Node

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    val l1 = ListNode(9)
     l1.next = ListNode(1)
     l1.next!!.next = ListNode(6)

    val l2 = ListNode(0)
//    l2.next = ListNode(6)
//    l2.next!!.next = ListNode(4)

    var res: ListNode? = null
    var node1 = l1
    var node2 = l2

    var carry = 0
    while (true) {
        var sum = 0
        sum = if (carry != 0) {
            node1.`val` + node2.`val` + carry
        } else {
            node1.`val` + node2.`val`
        }
        carry = sum / 10
        res = append(sum % 10, res)

        if (node1.next != null && node2.next == null) {
            carry += node1.next!!.`val`
        }

        if (node1.next == null && node2.next != null) {
            carry += node2.next!!.`val`
        }

        if (node1.next != null || node2.next != null) {
            if (node1.next !=null)
            node1 = node1.next!!
            if (node1.next !=null)
            node2 = node2.next!!
        } else {

            if (carry != 0){
//                res = append(carry/10, res)
                res = append(carry%10, res)
            }
            if (carry % 10 == 0 && carry > 0) {
                res = append(carry/10, res)
            }
            break
        }
    }

    print(res)

}

fun append(data: Int, head: ListNode?): ListNode {
    val newNode = ListNode(data)
    newNode.next = null

    //if head is empty
    if (head == null) {
        return newNode
    }
    var last = head

    while (true) {
        if (last!!.next != null) {
            last = last.next!!
        } else {
            last.next = newNode
            break
        }
    }
    return head
}