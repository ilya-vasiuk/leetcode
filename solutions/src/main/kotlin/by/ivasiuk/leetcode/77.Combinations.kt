package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/combinations/">Combinations</a>
 */
class Combinations {
  fun combine(n: Int, k: Int): List<List<Int>> {
    val res = mutableSetOf<List<Int>>()

    fun backtrack(j: Int, cur: List<Int>) {
      if (cur.size == k) {
        res += cur
      } else {
        for (num in j + 1..n) {
          backtrack(num, cur + num)
        }
      }
    }

    backtrack(0, listOf())

    return res.toList()
  }
}
