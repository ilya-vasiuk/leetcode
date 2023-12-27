package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-to-make-rope-colorful/">
 *   Minimum Time to Make Rope Colorful</a>
 */
class MinimumTimeToMakeRopeColorful {
  fun minCost(colors: String, neededTime: IntArray): Int {
    var cost = 0

    with(Stack<Int>()) {
      for (i in neededTime.indices) {
        if(isEmpty() || colors[i] != colors[peek()]) {
          push(i)
        } else {
          cost += minOf(neededTime[i], neededTime[peek()])

          if(neededTime[i] > neededTime[peek()]) {
            pop()
            push(i)
          }
        }
      }
    }

    return cost
  }
}
