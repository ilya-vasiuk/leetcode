package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/insert-interval/">
 *   Insert Interval</a>
 */
//TODO: hehe, work smart not hard
class InsertInterval {
  private val merger = MergeIntervals()

  fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> =
    merger.merge(intervals + newInterval)
}