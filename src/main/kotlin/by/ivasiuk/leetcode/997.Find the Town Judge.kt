package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/find-the-town-judge/">
 *   Find the Town Judge</a>
 */
class FindTheTownJudge {
  fun findJudge(n: Int, trust: Array<IntArray>): Int =
    IntArray(n + 1).also {
      trust.forEach { (a, b) ->
        it[a]--
        it[b]++
      }
    }.indexOf(n - 1)
}
