package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/new-21-game/">New 21 Game</a>
 */
class New21Game {
  fun new21Game(n: Int, k: Int, maxPts: Int): Double {
    if (k == 0 || n >= k + maxPts) {
      return 1.0
    }

    val probs = DoubleArray(n + 1).also {
      it[0] = 1.0
    }
    var windowSum = 1.0
    var probability = 0.0

    for (i in 1..n) {
      probs[i] = windowSum / maxPts
      if (i < k) {
        windowSum += probs[i]
      } else {
        probability += probs[i]
      }

      if (i - maxPts >= 0) {
        windowSum -= probs[i - maxPts]
      }
    }

    return probability
  }
}
