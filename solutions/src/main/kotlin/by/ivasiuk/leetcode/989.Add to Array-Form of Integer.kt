package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/add-to-array-form-of-integer/">
 *   Add to Array-Form of Integer</a>
 */
class AddToArrayFormOfInteger {
  fun addToArrayForm(num: IntArray, k: Int): List<Int> {
    val result = LinkedList<Int>()
    var num2 = k
    var carry = 0
    var i = num.size

    while (i-- > 0 || num2 > 0 || carry > 0) {
      val x = if (i < 0) 0 else num[i]
      val y = num2 % 10

      result.addFirst((x + y + carry) % 10)
      carry = (x + y + carry) / 10
      num2 /= 10
    }

    return result
  }
}
