package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class MinimumOperationsToMakeArrayEqual2 {
  fun minOperations(nums1: IntArray, nums2: IntArray, k: Int): Long {
    var ups: Long = 0
    var downs: Long = 0
    var different = false

    for (i in nums1.indices) {
      if (nums1[i] != nums2[i]) {
        different = true

        if (k == 0) {
          return -1
        }
        if (nums2[i] > nums1[i] && (nums2[i] - nums1[i]) % k == 0) {
          ups += (nums2[i] - nums1[i]) / k
        } else if (nums1[i] > nums2[i] && (nums1[i] - nums2[i]) % k == 0) {
          downs += (nums1[i] - nums2[i]) / k
        } else {
          return -1
        }
      }
    }

    return if (different) {
      if (ups == downs && ups != 0L) ups else -1
    } else {
      0
    }
  }
}
