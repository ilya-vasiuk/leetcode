package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-distinct-averages/">
 *   Number of Distinct Averages</a>
 */
class NumberOfDistinctAverages {
  fun distinctAverages(nums: IntArray): Int {
    val numbers = IntArray(102)
    val result = mutableSetOf<Double>()

    for (num in nums) {
      numbers[num]++
    }

    var i = 0
    var j = 100

    while (i < j) {
      while (i <= j && numbers[i] == 0) i++
      while (i <= j && numbers[j] == 0) j--

      if (numbers[i] == 0 && numbers[j] == 0) {
        break
      }

      result.add((i + j) / 2.0)

      val a = minOf(numbers[i], numbers[j])
      numbers[i] -= a
      numbers[j] -= a
    }

    return result.size
  }
}
