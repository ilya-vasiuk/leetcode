package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reducing-dishes/">
 *   Reducing Dishes</a>
 */
class ReducingDishes {
  fun maxSatisfaction(satisfaction: IntArray): Int {
    satisfaction.sortDescending()

    var suffixSum = 0
    var max = 0
    var i = 0

    while (i < satisfaction.size && suffixSum + satisfaction[i] > 0) {
      suffixSum += satisfaction[i++]
      max += suffixSum
    }

    return max
  }
}
