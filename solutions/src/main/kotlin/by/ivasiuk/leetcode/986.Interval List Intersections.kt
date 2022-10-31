package by.ivasiuk.leetcode

import kotlin.math.max
import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/interval-list-intersections/">
 *   Interval List Intersections</a>
 */
class IntervalListIntersections {
  fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
    var i = 0
    var j = 0

    val result = mutableListOf<IntArray>()

    while (i < firstList.size && j < secondList.size) {
      val left = max(firstList[i][0], secondList[j][0])
      val right = min(firstList[i][1], secondList[j][1])

      if (left <= right) result.add(intArrayOf(left, right))
      if(firstList[i][1] < secondList[j][1]) i++ else j++
    }

    return result.toTypedArray()
  }
}