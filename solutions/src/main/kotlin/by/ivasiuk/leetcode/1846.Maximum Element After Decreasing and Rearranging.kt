package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/">
 *   Maximum Element After Decreasing and Rearranging</a>
 */
class MaximumElementAfterDecreasingAndRearranging {
  fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
    var count = 1

    arr.sort()
    arr[0] = 1

    for (i in 1 until arr.size) {
      if (arr[i] > arr[i - 1]) {
        arr[i] = arr[i - 1] + 1
        count++
      }
    }

    return count
  }
}
