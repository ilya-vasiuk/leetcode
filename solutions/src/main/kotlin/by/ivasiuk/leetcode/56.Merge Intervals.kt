package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/merge-intervals/">Merge Intervals</a>
 */
class MergeIntervals {
  fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    var i = 0
    intervals.sortBy { it[0] }

    while (i < intervals.size) {
      val current = intervals[i]

      var j = i + 1
      while (j < intervals.size && intervals[j][0] <= current[1]) {
        current[0] = minOf(intervals[j][0], current[0])
        current[1] = maxOf(intervals[j][1], current[1])
        j++
      }

      result.add(current)
      i = j
    }

    return result.toTypedArray()
  }
}
