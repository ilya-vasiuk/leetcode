package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/">
 *   Minimum Number of Taps to Open to Water a Garden</a>
 */
class MinimumNumberOfTapsToOpenToWaterAGarden {
  fun minTaps(n: Int, ranges: IntArray): Int {
    var end = 0
    var last = -101
    var result = 0

    ranges.mapIndexed { i, v -> i - v to i + v }.filter { (l, r) -> l != r }
      .sortedBy { it.first }.forEach { (left, right) ->
        if (left <= last && right > end) {
          end = right
        } else if (end in left until right) {
          last = end
          end = right
          result++
        }

        if (end >= n) {
          return result
        }
      }

    return -1
  }
}
