package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/">
 *   Number of Ways to Reorder Array to Get Same BST</a>
 */
class NumberOfWaysToReorderArrayToGetSameBST {
  private lateinit var table: Array<LongArray>

  fun numOfWays(nums: IntArray): Int {
    val m = nums.size
    table = Array(m) { LongArray(m) }

    for (i in 0 until m) {
      table[i][i] = 1
      table[i][0] = table[i][i]
    }

    for (i in 2 until m) {
      for (j in 1 until i) {
        table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % MODULO
      }
    }

    return check(nums.asList()).toInt() - 1
  }
  private fun check(nums: List<Int>): Long {
    val m = nums.size
    if (m < 3) {
      return 1
    }

    val leftNodes = mutableListOf<Int>()
    val rightNodes = mutableListOf<Int>()

    for (i in 1 until m) {
      if (nums[i] < nums[0]) {
        leftNodes.add(nums[i])
      } else {
        rightNodes.add(nums[i])
      }
    }

    val leftWays = check(leftNodes) % MODULO
    val rightWays = check(rightNodes) % MODULO

    return leftWays * rightWays % MODULO * table[m - 1][leftNodes.size] % MODULO
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
