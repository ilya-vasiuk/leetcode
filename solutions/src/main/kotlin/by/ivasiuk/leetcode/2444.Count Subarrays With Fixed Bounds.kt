package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-fixed-bounds/">
 *   Count Subarrays With Fixed Bounds</a>
 */
class CountSubarraysWithFixedBounds {
  fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
    var lb = -1
    var lmin = -1
    var lmax = -1
    var count = 0L

    for (i in nums.indices) {
      if (nums[i] in minK..maxK) {
        lmin = if (nums[i] == minK) i else lmin
        lmax = if (nums[i] == maxK) i else lmax
        count += maxOf(0, minOf(lmin, lmax) - lb)
      } else {
        lb = i
        lmin = -1
        lmax = -1
      }
    }

    return count
  }
}
