package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/">
 *   Number of Ways to Divide a Long Corridor</a>
 */
class NumberOfWaysToDivideALongCorridor {
  fun numberOfWays(corridor: String): Int {
    var seatCount = 0
    var result = 1L
    var lastSeatIndex = -1

    corridor.forEachIndexed { i, type ->
      if (type == 'S') {
        seatCount++

        if (seatCount > 1 && seatCount % 2 != 0) {
          result = (result * (i - lastSeatIndex)) % MODULO
        }

        lastSeatIndex = i
      }
    }

    return if (seatCount < 2 || seatCount % 2 != 0) {
      0
    } else {
      maxOf(result  % MODULO , 1L).toInt()
    }
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
