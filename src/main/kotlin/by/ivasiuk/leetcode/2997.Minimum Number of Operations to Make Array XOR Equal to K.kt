package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/">
 *   Minimum Number of Operations to Make Array XOR Equal to K</a>
 */
class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
  fun minOperations(nums: IntArray, k: Int): Int = nums.fold(k, Int::xor).countOneBits()
}
