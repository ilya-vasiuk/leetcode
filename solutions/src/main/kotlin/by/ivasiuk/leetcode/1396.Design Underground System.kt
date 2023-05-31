package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-underground-system/">
 *   Design Underground System</a>
 */
class UndergroundSystem {
  private val checkins = mutableMapOf<Int, Pair<String, Int>>()
  private val travels = mutableMapOf<Pair<String, String>, MutableList<Int>>()

  fun checkIn(id: Int, stationName: String, t: Int) {
    checkins[id] = Pair(stationName, t)
  }

  fun checkOut(id: Int, stationName: String, t: Int) {
    val (startStation, startTime) = checkins[id]!!

    travels.computeIfAbsent(Pair(startStation, stationName)) { mutableListOf() }
      .add(t - startTime)
  }

  fun getAverageTime(startStation: String, endStation: String): Double {
    return travels[Pair(startStation, endStation)]!!.let { it.sum().div(it.size.toDouble()) }
  }
}
