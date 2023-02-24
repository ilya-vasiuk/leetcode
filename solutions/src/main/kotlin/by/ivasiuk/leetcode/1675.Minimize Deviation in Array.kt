package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/minimize-deviation-in-array/">
 *   Minimize Deviation in Array</a>
 */
class MinimizeDeviationInArray {
  fun minimumDeviation(nums: IntArray): Int {
    val evens = PriorityQueue(nums.size, compareByDescending<Int> { it })
    var min = Int.MAX_VALUE
    var result = Int.MAX_VALUE

    nums
      .map { if (it % 2 == 0) it else it * 2 }
      .forEach {
        evens.offer(it)
        min = minOf(it, min)
      }

    while (evens.peek() % 2 == 0) {
      val diff = evens.poll()
      result = minOf(result, diff - min)

      val tweaked = diff / 2
      evens.offer(tweaked)
      min = minOf(min, tweaked)
    }

    return minOf(evens.peek() - min, result)
  }
}
