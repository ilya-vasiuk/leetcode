package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sign-of-the-product-of-an-array/">
 *   Sign of the Product of an Array</a>
 */
class SignOfTheProductOfAnArray {
  fun arraySign(nums: IntArray): Int {
    var negative = false

    for (num in nums) {
      if (num < 0) {
        negative = !negative
      } else if (num == 0) {
        return 0
      }
    }

    return if (negative) -1 else 1
  }
}