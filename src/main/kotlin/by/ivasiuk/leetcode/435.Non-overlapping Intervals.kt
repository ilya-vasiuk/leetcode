package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/non-overlapping-intervals/">
 *   Non-overlapping Intervals</a>
 */
class NonOverlappingIntervals {
  fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    intervals.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] })

    var prevEnd = intervals[0][1]
    var count = 0

    for (i in 1 until intervals.size) {
      val (start, end) = intervals[i]

      prevEnd = if (start < prevEnd) {
        count++
        minOf(prevEnd, end)
      } else {
        end
      }
    }

    return count
  }
}
