package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/k-radius-subarray-averages/">
 *   K Radius Subarray Averages</a>
 */
class KRadiusSubarrayAverages {
  fun getAverages(nums: IntArray, k: Int): IntArray {
    val n = nums.size
    val result = IntArray(n) { -1 }
    val subSize = k + k + 1
    if (subSize > n) {
      return result
    }

    var sum = 0L
    for (i in 0 until subSize) {
      sum += nums[i]
    }

    var j = k
    result[j++] = (sum / subSize).toInt()

    for (i in subSize until nums.size) {
      sum = sum + nums[i] - nums[i - subSize]
      result[j++] = (sum / subSize).toInt()
    }

    return result
  }
}
