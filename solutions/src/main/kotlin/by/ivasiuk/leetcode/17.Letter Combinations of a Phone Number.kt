package by.ivasiuk.leetcode

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

    generate(digits, 0, "", results)

    return results
  }

  private fun generate(digits: String, current: Int, currentSequence: String, results: MutableList<String>) {
    if (current == digits.length) {
      if (currentSequence.isNotBlank()) {
        results.add(currentSequence)
      }
    } else if (digits[current] == '1') {
      generate(digits, current + 1, currentSequence, results)
    } else {
      for (letter in letters[digits[current]]!!) {
        generate(digits, current + 1, currentSequence + letter, results)
      }
    }
  }
}