package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/odd-string-difference/">
 *   Odd String Difference</a>
 */
class OddStringDifference {
  fun oddString(words: Array<String>): String {
    val diff0 = calcDiff(words[0])
    val diff1 = calcDiff(words[1])
    val diff2 = calcDiff(words[2])

    if (diff2.contentEquals(diff1) && !diff0.contentEquals(diff2)) {
      return words[0]
    }
    if (diff0.contentEquals(diff2) && !diff1.contentEquals(diff2)) {
      return words[1]
    }

    if (diff0.contentEquals(diff1) && !diff1.contentEquals(diff2)) {
      return words[2]
    }

    for (w in 3 until words.size) {
      if (!calcDiff(words[w]).contentEquals(diff0)) {
        return words[w]
      }
    }

    return ""
  }

  private fun calcDiff(word: String): IntArray {
    val current = IntArray(word.length - 1)

    for (i in 0 until word.length - 1) {
      current[i] = word[i + 1] - word[i]
    }

    return current
  }
}