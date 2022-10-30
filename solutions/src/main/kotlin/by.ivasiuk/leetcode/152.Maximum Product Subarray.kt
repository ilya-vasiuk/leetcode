package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-product-subarray/">
 *   Maximum Product Subarray</a>
 */
class MaximumProductSubarray {
  fun maxProduct(nums: IntArray): Int {
    var maxProduct = nums[0]
    var left = 0
    var right = 0

    for (i in nums.indices) {
      left = nums[i] * if (left == 0) 1 else left
      right = nums[nums.size - i - 1] * if (right == 0) 1 else right
      maxProduct = maxOf(maxProduct, left, right)
    }

    return maxProduct
  }
}