package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/">
 *   Maximum Number of Coins You Can Get</a>
 */
class MaximumNumberOfCoinsYouCanGet {
  fun maxCoins(piles: IntArray): Int = piles
    .sortedArray()
    .drop(piles.size / 3)
    .windowed(size = 2, step = 2)
    .sumOf { it.first() }
}
