package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/binary-trees-with-factors/">
 *   Binary Trees With Factors
 * </a>
 */
class BinaryTreesWithFactors {
  fun numFactoredBinaryTrees(arr: IntArray): Int {
    val set = arr.toSortedSet()
    val memo = mutableMapOf<Int, Long>()

    fun dfs(a: Int): Long = memo.getOrPut(a) {
      1L + arr.sumOf {
        if (a % it == 0 && set.contains(a / it)) {
          dfs(it) * dfs(a / it) }
        else {
          0L
        }
      }
    }

    return (arr.sumOf { dfs(it) } % MODULO).toInt()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
