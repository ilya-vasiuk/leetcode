package by.ivasiuk.leetcode

import kotlin.math.ceil

/**
 * @see <a href="https://leetcode.com/problems/successful-pairs-of-spells-and-potions/">
 *   Successful Pairs of Spells and Potions</a>
 */
class SuccessfulPairsOfSpellsAndPotions {
  fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
    potions.sort()

    return spells.map {
      var left = 0
      var right = potions.size - 1
      var result = potions.size

      val target = ceil(success / it.toDouble()).toLong()

      while (left <= right) {
        val middle = (right + left) / 2

        if (potions[middle] >= target) {
          result = middle
          right = middle - 1
        } else {
          left = middle + 1
        }
      }

      potions.size - result
    }.toIntArray()
  }
}
