package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sum-of-all-subset-xor-totals/">
 *   Sum of All Subset XOR Totals</a>
 */
class SumOfAllSubsetXorTotals {
  fun subsetXORSum(nums: IntArray): Int =
    nums.fold(0) { sum, num -> sum.or(num) }.shl(nums.lastIndex)
}
