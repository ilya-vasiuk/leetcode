package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/seat-reservation-manager/">
 *   Seat Reservation Manager
 * </a>
 */
class SeatManager(n: Int) {
  private val seats = BooleanArray(n) { false }
  private var availableSeat = 0

  fun reserve(): Int {
    while (seats[availableSeat]) {
      availableSeat++
    }

    seats[availableSeat] = true

    return availableSeat + 1
  }

  fun unreserve(seatNumber: Int) {
    seats[seatNumber - 1] = false

    if (seatNumber - 1 < availableSeat) {
      availableSeat = seatNumber - 1
    }
  }
}
