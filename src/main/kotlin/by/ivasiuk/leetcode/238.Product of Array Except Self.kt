package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/">Product of Array Except Self</a>
 */
class ProductOfArrayExceptSelf {
  fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val left = IntArray(n) { 1 }
    val right = IntArray(n) { 1 }

    for (i in 1 until n) {
      left[i] = left[i - 1] * nums[i - 1]
      right[n - i - 1] = right[n - i] * nums[n - i]
    }

    return IntArray(n) { left[it] * right[it] }
  }
}
