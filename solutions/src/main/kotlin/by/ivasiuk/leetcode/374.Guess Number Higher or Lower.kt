package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/guess-number-higher-or-lower/">
 *   Guess Number Higher or Lower</a>
 */
class GuessNumberHigherOrLower(pick: Int) : GuessGame(pick) {
  override fun guessNumber(n: Int): Int {
    var left = 1L
    var right = n.toLong()

    while(left <= right) {
      val middle = (left + right) / 2
      when (guess(middle.toInt())) {
        -1 -> right = middle - 1
        1 -> left = middle + 1
        else -> return middle.toInt()
      }
    }

    return -1
  }
}

abstract class GuessGame(
  private val pick: Int
) {
  fun guess(num: Int) =
    when {
      num > pick -> -1
      num < pick -> 1
      else -> 0
    }

  abstract fun guessNumber(n:Int): Int
}