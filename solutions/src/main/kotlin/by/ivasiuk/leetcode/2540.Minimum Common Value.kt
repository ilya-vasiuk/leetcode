package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-common-value/">
 *   Minimum Common Value</a>
 */
class MinimumCommonValue {
  fun getCommon(nums1: IntArray, nums2: IntArray): Int {
    var i = 0
    var j = 0

    while (i < nums1.size && j < nums2.size) {
      when {
        nums1[i] == nums2[j] -> return nums1[i]
        nums1[i] < nums2[j] -> i++
        else -> j++
      }
    }

    return -1
  }
}
