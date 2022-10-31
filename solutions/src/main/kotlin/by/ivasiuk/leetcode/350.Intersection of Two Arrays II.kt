package by.ivasiuk.leetcode

  import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">
 *   Intersection of Two Arrays II</a>
 */
class IntersectionOfTwoArrays2 {
  fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val count1 = IntArray(LIMIT)
    for (i in nums1.indices) {
      count1[nums1[i]]++
    }

    val count2 = IntArray(LIMIT)
    for (i in nums2.indices) {
      count2[nums2[i]]++
    }

    val result = mutableListOf<Int>()
    for (i in 0 until LIMIT) {
      for (j in 0 until min(count1[i], count2[i])) {
        result.add(i)
      }
    }

    return result.toIntArray()
  }

  companion object {
    const val LIMIT = 1001
  }
}