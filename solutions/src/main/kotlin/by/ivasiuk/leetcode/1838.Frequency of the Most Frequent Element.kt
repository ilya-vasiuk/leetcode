package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/frequency-of-the-most-frequent-element/">
 *   Frequency of the Most Frequent Element</a>
 */
class FrequencyOfTheMostFrequentElement {
  fun maxFrequency(nums: IntArray, k: Int): Int {
    nums.sort()
    var max = 0
    var sum = 0L
    var left = 0
    var right = 0

    while (right < nums.size) {
      sum += nums[right]

      while (nums[right] * (right - left + 1) > sum + k) {
        sum -= nums[left++]
      }

      max = maxOf(max, right++ - left + 1)
    }

    return max
  }
}
