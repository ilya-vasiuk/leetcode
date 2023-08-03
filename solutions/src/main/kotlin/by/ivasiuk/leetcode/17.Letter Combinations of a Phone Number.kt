package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">
 *   Letter Combinations of a Phone Number</a>
 */
class LetterCombinationsOfAPhoneNumber {
  private val letters = mapOf(
    '1' to setOf(),
    '2' to setOf('a', 'b', 'c'),
    '3' to setOf('d', 'e', 'f'),
    '4' to setOf('g', 'h', 'i'),
    '5' to setOf('j', 'k', 'l'),
    '6' to setOf('m', 'n', 'o'),
    '7' to setOf('p', 'q', 'r', 's'),
    '8' to setOf('t', 'u', 'v'),
    '9' to setOf('w', 'x', 'y', 'z'),
  )

  fun letterCombinations(digits: String): List<String> {
    val results = mutableListOf<String>()

    fun generate(digits: String, current: Int, currentSequence: List<Char>) {
      if (current == digits.length) {
        if (currentSequence.isNotEmpty()) {
          results.add(currentSequence.joinToString(""))
        }
      } else if (digits[current] == '1') {
        generate(digits, current + 1, currentSequence)
      } else {
        for (letter in letters[digits[current]]!!) {
          generate(digits, current + 1, currentSequence + letter)
        }
      }
    }

    generate(digits, 0, LinkedList<Char>())

    return results
  }
}