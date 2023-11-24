package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicate-letters/">
 *   Remove Duplicate Letters</a>
 */
class RemoveDuplicateLetters {
  fun removeDuplicateLetters(s: String): String {
    val prev = mutableMapOf<Char, Int>()
    val seen = mutableSetOf<Char>()

    for (c in s) {
      prev[c] = prev.getOrDefault(c, 0) + 1
    }

    for (c in s) {
      prev[c] = prev.getValue(c) - 1

      if (!seen.contains(c)) {
        while (seen.isNotEmpty() && c < seen.last() && prev.getValue(seen.last()) > 0) {
          seen.remove(seen.last())
        }

        seen.add(c)
      }
    }

    return seen.joinToString("")
  }
}
