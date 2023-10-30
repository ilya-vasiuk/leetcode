package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/poor-pigs/">Poor Pigs</a>
 */
class PoorPigs {
  fun poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int {
    val testsPerPig = minutesToTest / minutesToDie
    var numPigs = 0
    var states = 1

    while (states < buckets) {
      states *= testsPerPig + 1
      numPigs++
    }

    return numPigs
  }
}
