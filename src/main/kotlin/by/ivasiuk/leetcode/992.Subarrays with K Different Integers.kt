package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/subarrays-with-k-different-integers/">
 *   Subarrays with K Different Integers</a>
 */
class SubarraysWithKDifferentIntegers {
  fun subarraysWithKDistinct(nums: IntArray, k: Int): Int {
    fun slidingWindow(k: Int): Int {
      var i = 0
      var j = 0
      var count = 0
      val map = mutableMapOf<Int, Int>()

      while (j < nums.size) {
        map[nums[j]] = map.getOrDefault(nums[j], 0) + 1

        while (map.size > k) {
          map[nums[i]] = map[nums[i]]!! - 1

          if (map[nums[i]] == 0) {
            map.remove(nums[i])
          }

          i++
        }

        count += j - i + 1
        j++
      }

      return count
    }

    return slidingWindow(k) - slidingWindow(k - 1)
  }
}
