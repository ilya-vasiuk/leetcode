package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/removing-stars-from-a-string/">
 *   Removing Stars From a String</a>
 */
class RemovingStarsFromAString {
  fun removeStars(s: String) =
    buildString {
      s.forEach { c ->
        if (c == '*') deleteAt(length - 1) else append(c)
      }
    }
}
