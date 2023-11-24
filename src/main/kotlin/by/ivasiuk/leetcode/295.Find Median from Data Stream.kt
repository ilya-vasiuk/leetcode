package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-median-from-data-stream/">
 *   Find Median from Data Stream</a>
 */
//TODO: try heaps approach
class MedianFinder {
  private val stream = mutableListOf<Int>()
  private var even = true
  private var middle = 0

  fun addNum(num: Int) {
    var i = 0

    while (i < stream.size && stream[i] < num) i++
    stream.add(i, num)
    even = !even

    if (even) middle++
  }

  fun findMedian(): Double =
    if (even) (stream[middle] + stream[middle - 1]) / 2.0 else stream[middle].toDouble()
}
