package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/continuous-subarray-sum/">
 *   Continuous Subarray Sum</a>
 */
class ContinuousSubarraySum {
  fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    val modulos = HashSet<Int>()
    var sum = 0
    var memo = 0

    for (n in nums) {
      sum = (sum + n) % k

      if (modulos.contains(sum)) {
        return true
      }

      modulos.add(memo)
      memo = sum
    }

    return false
  }
}