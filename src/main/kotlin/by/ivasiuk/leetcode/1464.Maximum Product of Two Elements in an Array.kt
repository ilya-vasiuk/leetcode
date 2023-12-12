package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Maximum Product of Two Elements in an Array</a>
 */
class MaximumProductOfTwoElementsInAnArray {
  fun maxProduct(nums: IntArray): Int {
    var max1 = maxOf(nums[0], nums[1])
    var max2 = minOf(nums[0], nums[1])

    for (i in 2 until nums.size) {
      if (nums[i] > max1) {
        max2 = max1
        max1 = nums[i]
      } else if (nums[i] > max2) {
        max2 = nums[i]
      }
    }

    return (max1 - 1) * (max2 - 1)
  }
}
