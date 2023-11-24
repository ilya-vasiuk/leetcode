package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">
 *   Kth Largest Element in an Array</a>
 */
class KthLargestElementInAnArray {
  fun findKthLargest(nums: IntArray, k: Int): Int {
    var left = 0
    var right = nums.lastIndex
    val target = nums.size - k

    fun swap(a: Int, b: Int) {
      nums[a] = nums[b].also { nums[b] = nums[a] }
    }

    while (left <= right) {
      var pi = left
      val pivot = nums[right]

      for (i in left until right) {
        if (nums[i] < pivot) {
          swap(i, pi++)
        }
      }

      swap(right, pi)

      when {
        pi < target -> left = pi + 1
        pi > target -> right = pi - 1
        else -> return nums[pi]
      }
    }

    return -1
  }
}
