package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/">
 *   Capacity To Ship Packages Within D Days</a>
 */
class CapacityToShipPackagesWithinDDays {
  fun shipWithinDays(weights: IntArray, days: Int): Int {
    var maxWeight = -1
    var totalWeight = 0

    for (weight in weights) {
      maxWeight = maxOf(maxWeight, weight)
      totalWeight += weight
    }

    var left = maxWeight
    var right = totalWeight

    while (left < right) {
      val mid = (left + right) / 2
      var daysNeeded = 1
      var currWeight = 0

      for (weight in weights) {
        if (currWeight + weight > mid) {
          daysNeeded++
          currWeight = 0
        }

        currWeight += weight
      }

      if (daysNeeded > days) {
        left = mid + 1
      } else {
        right = mid
      }
    }

    return left
  }
}
