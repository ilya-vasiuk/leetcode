package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/partition-equal-subset-sum/">
 *   Partition Equal Subset Sum</a>
 */
class PartitionEqualSubsetSum {
  fun canPartition(nums: IntArray): Boolean {
    val sum = nums.sum()
    if (sum % 2 == 1) {
      return false
    }

    val result = BooleanArray(sum + 1) { i -> i == 0 }

    for (num in nums) {
      for (current in sum downTo num) {
        result[current] = result[current] || result[current - num]
      }
    }

    return result[sum / 2]
  }
}