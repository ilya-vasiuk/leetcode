package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/time-needed-to-buy-tickets/">
 *   Time Needed to Buy Tickets</a>
 */
class TimeNeededToBuyTickets {
  fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
    val target = tickets[k]
    var result = 0

    for (i in 0..k) {
      result += minOf(tickets[i], target)
    }

    for (i in k + 1 until tickets.size) {
      result += minOf(tickets[i], target - 1)
    }

    return result
  }
}
