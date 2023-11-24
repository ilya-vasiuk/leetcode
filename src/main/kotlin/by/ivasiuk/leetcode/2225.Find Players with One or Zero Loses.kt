package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-players-with-one-or-zero-loses/">
 *   Find Players With One or Zero Loses</a>
 */
class FindPlayersWithOneOrZeroLoses {
  fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val results = mutableMapOf<Int, Int>()

    matches.forEach { (winner, looser) ->
      results.putIfAbsent(winner, 0)
      results[looser] = results.getOrDefault(looser, 0) + 1
    }

    val unbeaten = mutableListOf<Int>()
    val loosedOnce = mutableListOf<Int>()

    results.entries
      .filter { it.value in 0..1 }
      .sortedBy { it.key }
      .forEach {
        (if (it.value == 0) unbeaten else loosedOnce).add(it.key)
      }

    return listOf(unbeaten, loosedOnce)
  }
}
