package by.ivasiuk.leetcode

import java.util.PriorityQueue
import kotlin.text.StringBuilder

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Sort Vowels in a String</a>
 */
class SortVowelsInAString {
  fun sortVowels(s: String): String {
    val vowels = PriorityQueue<Char>()

    for (c in s) {
      if (c in VOWELS) {
        vowels.offer(c)
      }
    }

    return with(StringBuilder()) {
      for (i in s.indices) {
        if (s[i] in VOWELS) {
          append(vowels.poll())
        } else {
          append(s[i])
        }
      }

      toString()
    }
  }

  companion object {
    val VOWELS = setOf('a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O')
  }
}
