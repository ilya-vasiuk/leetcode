package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/">
 *   Minimum Amount of Time to Collect Garbage</a>
 */
class MinimumAmountOfTimeToCollectGarbage {
  fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
    val set = mutableSetOf<Char>()
    var result = 0

    for (i in garbage.lastIndex downTo 1) {
      set.addAll(garbage[i].asIterable())
      result += garbage[i].length + set.size * travel[i - 1]
    }

    return result + garbage[0].length
  }
}
