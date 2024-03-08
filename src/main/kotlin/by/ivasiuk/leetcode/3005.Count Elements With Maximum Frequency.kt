package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-elements-with-maximum-frequency/">
 *   Count Elements With Maximum Frequency</a>
 */
class CountElementsWithMaximumFrequency {
  fun maxFrequencyElements(nums: IntArray): Int {
    var max = 0
    var result = 0
    val freq = IntArray(101)

    for (n in nums) {
      val current = 1 + freq[n]

      if (current == max) {
        result += current
      }

      if (current > max) {
        max = current
        result = current
      }

      freq[n] = current
    }

    return result
  }
}
