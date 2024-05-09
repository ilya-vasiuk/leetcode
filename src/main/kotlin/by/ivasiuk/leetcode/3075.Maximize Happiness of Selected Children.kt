package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximize-happiness-of-selected-children/">
 *   Maximize Happiness of Selected Children</a>
 */
class MaximizeHappinessOfSelectedChildren {
  fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
    happiness.sortDescending()
    var result = 0L

    for (i in 0 until k) {
      if (happiness[i] > i) {
        result += happiness[i] - i
      }
    }

    return result
  }
}
