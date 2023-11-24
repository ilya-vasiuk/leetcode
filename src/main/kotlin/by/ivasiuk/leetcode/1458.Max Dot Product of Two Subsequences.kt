package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/max-dot-product-of-two-subsequences/">
 *   Max Dot Product of Two Subsequences</a>
 */
class MaxDotProductOfTwoSubsequences {
  fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
    val maximum = Array(nums1.size) { IntArray(nums2.size) { Int.MIN_VALUE } }

    fun check(i: Int, j: Int): Int =
      when {
        i >= nums1.size || j >= nums2.size -> Int.MIN_VALUE
        maximum[i][j] > Int.MIN_VALUE -> maximum[i][j]
        else -> maxOf(
          nums1[i] * nums2[j] + maxOf(check(i + 1, j + 1), 0),
          check(i + 1, j),
          check(i, j + 1)
        ).also { maximum[i][j] = it }
      }

    return check(0, 0)
  }
}
