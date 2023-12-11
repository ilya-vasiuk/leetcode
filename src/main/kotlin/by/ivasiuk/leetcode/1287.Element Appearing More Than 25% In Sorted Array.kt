package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/">
 *   Element Appearing More Than 25% In Sorted Array</a>
 */
class ElementAppearingMoreThan25InSortedArray {
  fun findSpecialInteger(arr: IntArray): Int {
    var max = arr[0]
    var maxCount = 0
    var current = arr[0]
    var count = 0

    val step = if (arr.size >= 8) arr.size / 8 else 1

    for (i in 1 until arr.size step step) {
      if (arr[i] == current) {
        count++

        if (count >= maxCount) {
          maxCount = count
          max = current
        }
      } else {
        current = arr[i]
        count = 0
      }
    }

    return max
  }
}
