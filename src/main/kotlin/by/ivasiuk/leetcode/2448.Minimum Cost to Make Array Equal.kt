package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-make-array-equal/">
 *   Minimum Cost to Make Array Equal</a>
 */
class MinimumCostToMakeArrayEqual {
  fun minCost(nums: IntArray, cost: IntArray): Long {
    val max = nums.max()
    val arr = IntArray(max + 1)
    for (i in nums.indices) {
      arr[nums[i]] += cost[i]
    }

    var a = 0L
    var b = 0L
    val prefix = LongArray(arr.size)

    for (i in arr.indices) {
      a += arr[i]
      b += a
      prefix[i] = b
    }

    a = 0L
    b = 0L
    val suffix = LongArray(arr.size + 1)

    for (i in arr.indices.reversed()) {
      a += arr[i]
      b += a
      suffix[i] = b
    }

    var min = Long.MAX_VALUE
    for (i in nums) {
      min = minOf(min, prefix[i - 1] + suffix[i + 1])
    }

    return min
  }
}
