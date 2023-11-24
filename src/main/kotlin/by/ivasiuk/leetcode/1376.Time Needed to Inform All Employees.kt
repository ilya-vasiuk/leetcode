package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/time-needed-to-inform-all-employees/">
 *   Time Needed to Inform All Employees</a>
 */
class TimeNeededToInformAllEmployees {
  fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
    var max = informTime[headID]

    val timeToInform = IntArray(n) { -1 }.also {
      it[headID] = informTime[headID]
    }

    fun inform(i: Int): Int {
      if (timeToInform[i] == -1) {
        timeToInform[i] = inform(manager[i]) + informTime[i]
      }

      return timeToInform[i]
    }

    for (i in 0 until n) {
      if (timeToInform[i] == -1) {
        max = maxOf(max, inform(i))
      }
    }

    return max
  }
}
