package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">
 *   Maximum Product Difference Between Two Pairs</a>
 */
class MaximumProductDifferenceBetweenTwoPairs {
  fun maxProductDifference(nums: IntArray): Int {
    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE

    for (num in nums) {
      if (num < min1) {
        min2 = min1
        min1 = num
      } else if (num < min2) {
        min2 = num
      }
      if (num > max1) {
        max2 = max1
        max1 = num
      } else if (num > max2) {
        max2 = num
      }
    }


    return max1 * max2 - min1 * min2
  }
}
