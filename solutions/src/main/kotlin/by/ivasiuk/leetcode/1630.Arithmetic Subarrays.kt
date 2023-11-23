package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/arithmetic-subarrays/">
 *   Arithmetic Subarrays</a>
 */
class ArithmeticSubarrays {
  private fun isArithmetical(sub: IntArray): Boolean {
    sub.sort()
    val diff = sub[0] - sub[1]

    return (2 until sub.size)
      .all { sub[it - 1] - sub[it] == diff }
  }

  fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> =
    l.indices.map { isArithmetical(nums.sliceArray(l[it]..r[it])) }
}
