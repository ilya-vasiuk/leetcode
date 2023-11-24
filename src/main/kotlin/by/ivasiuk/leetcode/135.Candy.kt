package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/candy/">Candy</a>
 */
class Candy {
  fun candy(ratings: IntArray): Int {
    val candiesReverse = IntArray(ratings.size)

    for (i in candiesReverse.size - 2 downTo 0) {
      if (ratings[i] > ratings[i + 1]) {
        candiesReverse[i] = candiesReverse[i + 1] + 1
      }
    }

    var sum = ratings.size + candiesReverse[0]
    val candiesForward = IntArray(ratings.size)

    for (i in 1 until ratings.size) {
      candiesForward[i] = if (ratings[i] > ratings[i - 1]) candiesForward[i - 1] + 1 else 0
      sum += maxOf(candiesForward[i], candiesReverse[i])
    }

    return sum
  }
}
