package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays/">Intersection of Two Arrays</a>
 */
class IntersectionOfTwoArrays {
  fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val freq = BooleanArray(1001)
    for (n in nums1) {
      freq[n] = true
    }

    val result = mutableListOf<Int>()

    for (n in nums2) {
      if (freq[n]) {
        freq[n] = false
        result.add(n)
      }
    }

    return result.toIntArray()
  }
}
