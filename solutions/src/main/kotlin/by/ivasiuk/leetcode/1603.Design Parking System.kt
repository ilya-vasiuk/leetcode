package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-parking-system/">
 *   Design Parking System</a>
 */
class ParkingSystem(big: Int, medium: Int, small: Int) {
  private val lots = intArrayOf(big, medium, small)

  fun addCar(carType: Int): Boolean {
    if (lots[carType - 1] == 0) {
      return false
    }

    lots[carType - 1]--
    return true
  }
}
