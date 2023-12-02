package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">
 *   Find Words That Can Be Formed by Characters</a>
 */
class FindWordsThatCanBeFormedByCharacters {
  fun countCharacters(words: Array<String>, chars: String): Int {
    val letters = IntArray(26)
    chars.forEach { c -> letters[c - 'a']++ }

    fun check(word: String): Boolean {
      val current = IntArray(26)

      for (c in word) {
        if (++current[c - 'a'] > letters[c - 'a']) {
          return false
        }
      }

      return true
    }

    return words.filter { check(it) }.sumOf { it.length }
  }
}
