package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/">
 *   Minimum Deletions to Make Character Frequencies Unique</a>
 */
class MinimumDeletionsToMakeCharacterFrequenciesUnique {
  fun minDeletions(s: String): Int {
    var result = 0
    var top = Int.MAX_VALUE
    val freq = IntArray(26).also {
      s.forEach { c -> it[c - 'a']++ }
      it.sortDescending()
    }

    for (x in freq) {
      val target = maxOf(0, top - 1)
      result += maxOf(0, x - target)
      top = minOf(x, target)
    }

    return result
  }
}
