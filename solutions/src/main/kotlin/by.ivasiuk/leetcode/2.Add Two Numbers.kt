package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
class AddTwoNumbers {
  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var vl1 = l1
    var vl2 = l2
    val head = ListNode(0)
    var current = head
    var carry = 0
    while (vl1 != null || vl2 != null || carry != 0) {
      current.next = ListNode(0)
      current = current.next!!
      val currentA = vl1?.`val` ?: 0
      val currentB = vl2?.`val` ?: 0
      current.`val` = (currentA + currentB + carry) % 10
      carry = (currentA + currentB + carry) / 10
      vl1?.let { vl1 = it.next }
      vl2?.let { vl2 = it.next }
    }

    return head.next
  }

  class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }
}