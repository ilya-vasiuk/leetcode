package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/bag-of-tokens/">Bag of Tokens</a>
 */
class BagOfTokens {
  fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
    tokens.sort()
    var score = 0
    var current = power
    var left = 0
    var right = tokens.lastIndex

    while (true) {
      val diff = right - left

      when {
        diff < 0 -> break
        current >= tokens[left] -> {
          current -= tokens[left]
          left++
          score++
        }
        score > 0 && diff > 0 -> {
          current += tokens[right]
          right--
          score--
        }
        else -> break
      }
    }

    return score
  }
}
