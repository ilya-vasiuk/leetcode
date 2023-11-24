package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">
 *   Peak Index in a Mountain Array</a>
 */
class PeakIndexInAMountainArray {
  fun peakIndexInMountainArray(arr: IntArray): Int {
    var left = 1
    var right = arr.lastIndex
    var max = -1

    while (left <= right) {
      val mid = (right + left) / 2

      if (arr[mid] > arr[mid - 1]) {
        max = mid
        left = mid + 1
      } else {
        right = mid - 1
      }
    }

    return max
  }
}
