package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/kth-missing-positive-number/">
 *   Kth Missing Positive Number</a>
 */
class KthMissingPositiveNumber {
  fun findKthPositive(arr: IntArray, k: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
      val mid = (left + right) / 2

      if (arr[mid] - mid - 1 < k) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }

    return left + k
  }
}
