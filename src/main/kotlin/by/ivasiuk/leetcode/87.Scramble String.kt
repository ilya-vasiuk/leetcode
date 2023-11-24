package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/scramble-string/">
 *   Scramble String</a>
 */
class ScrambleString {
  private val cache = mutableMapOf<String, Boolean>()

  fun isScramble(s1: String, s2: String): Boolean =
    when {
      s1.isEmpty() -> true
      s1.length == 1 -> s1 == s2
      s1.length != s2.length -> false
      cache.containsKey(s1 + s2) -> cache[s1 + s2]!!
      else -> {
        (s1 == s2 || (1 until s1.length).any { i ->
          isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i)) ||
              isScramble(s1.substring(0, i), s2.substring(s2.length - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length - i))
        }).also { cache[s1 + s2] = it }
      }
    }
}
