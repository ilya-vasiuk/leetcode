package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-achievable-transfer-requests/">
 *   Maximum Number of Achievable Transfer Requests</a>
 */
class MaximumNumberOfAchievableTransferRequests {
  fun maximumRequests(n: Int, requests: Array<IntArray>): Int {
    val buildings = IntArray(n)

    fun check(i: Int, transfers: Int): Int {
      if (i == requests.size) {
        return if (buildings.count { it == 0 } == buildings.size)
          transfers
        else
          0
      }

      val (from, to) = requests[i]
      buildings[from]--
      buildings[to]++

      val transfer = check(i + 1, transfers + 1)
      buildings[from]++
      buildings[to]--

      return maxOf(check(i + 1, transfers), transfer)
    }

    return check(0, 0)
  }
}
