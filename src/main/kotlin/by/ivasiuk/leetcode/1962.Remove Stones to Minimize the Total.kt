package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class RemoveStonesToMinimizeTheTotal {
  fun minStoneSum(piles: IntArray, k: Int): Int {
    val frequency = IntArray(10001)
    var max = -1
    for (p in piles) {
      frequency[p]++
      max = maxOf(max, p)
    }

    var i = max
    var runs = 0
    while (i >= 1 && runs < k) {
      while (frequency[i] != 0 && runs < k) {
        frequency[i]--
        frequency[(i + 1) / 2]++
        runs++
      }

      i--
    }

    var ans = 0
    for (i in max downTo 1) {
      ans += frequency[i] * i
    }

    return ans
  }
}
