package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/koko-eating-bananas/">
 *   Koko Eating Bananas</a>
 */
class KokoEatingBananas {
  fun minEatingSpeed(piles: IntArray, h: Int): Int {
    fun check(maxPiles: Int) =
      piles.sumOf { it / maxPiles + if (it % maxPiles != 0) 1 else 0 } <= h

    var left = 1
    var right = piles.max()

    while (left < right) {
      val mid = (left + right) / 2

      if (check(mid)) {
        right = mid
      } else {
        left = mid + 1
      }
    }

    return left
  }
}
