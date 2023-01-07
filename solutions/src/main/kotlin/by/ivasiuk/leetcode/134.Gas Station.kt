package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/gas-station/">
 *   Gas Station</a>
 */
class GasStation {
  fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var total = 0
    var avail = 0
    var start = 0

    for (i in gas.indices) {
      total += gas[i] - cost[i]
      avail += gas[i] - cost[i]

      if (avail < 0) {
        avail = 0
        start = i + 1
      }
    }
    return if (total < 0) -1 else start
  }
}
