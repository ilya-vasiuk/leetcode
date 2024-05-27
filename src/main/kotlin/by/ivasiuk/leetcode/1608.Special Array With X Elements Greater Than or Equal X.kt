package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/">
 *   Special Array With X Elements Greater Than or Equal X</a>
 */
class SpecialArrayWithXElementsGreaterThanOrEqualX {
  fun specialArray(nums: IntArray): Int {
    var left = 0
    var right = nums.size

    while(left <= right) {
      val middle = left + (right - left) / 2
      val count = nums.count { it >= middle }

      when {
        count > middle -> left = middle + 1
        count < middle -> right = middle - 1
        else -> return middle
      }
    }

    return -1
  }
}
