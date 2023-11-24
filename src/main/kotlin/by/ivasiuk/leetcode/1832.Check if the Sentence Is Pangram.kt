package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">
 *   Check if the Sentence Is Pangram</a>
 */
class CheckIfTheSentenceIsPangram {
  fun checkIfPangram(sentence: String): Boolean {
    if (sentence.length < 26) return false
    val appears = BooleanArray(26) { false }

    for (i in sentence.indices) {
      appears[sentence[i].minus('a')] = true
    }

    return appears.none { !it }
  }
}