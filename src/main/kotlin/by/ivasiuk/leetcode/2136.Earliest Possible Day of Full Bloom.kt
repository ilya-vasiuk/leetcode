package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/earliest-possible-day-of-full-bloom/">
 *   Earliest Possible Day of Full Bloom</a>
 */
class EarliestPossibleDayOfFullBloom {
  fun earliestFullBloom(plantTime: IntArray, growTime: IntArray): Int {
    var result = 0
    var curPlantTime = 0
    val indices = growTime.indices
      .sortedWith(compareBy { i -> -growTime[i] })

    for (i in growTime.indices) {
      val idx = indices[i]
      val time = curPlantTime + plantTime[idx] + growTime[idx]
      result = max(result, time)
      curPlantTime += plantTime[idx]
    }

    return result
  }
}