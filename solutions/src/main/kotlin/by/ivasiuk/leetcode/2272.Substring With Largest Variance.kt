package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/substring-with-largest-variance/">
 *    Substring With Largest Variance</a>
 */
class SubstringWithLargestVariance {
  fun largestVariance(s: String): Int {
    var max = 0

    for (c1 in 'a'..'z') {
      for (c2 in 'a'..'z') {
        val c = s.filter { it == c1 || it == c2 }
          .map { if (it == c1) 1 else -1 }
        if (c1 != c2) {
          max = maxOf(max, kadane(c))
        }
      }
    }

    return max
  }

  private fun kadane(arr: List<Int>): Int {
    if (arr.size == 2 || !arr.contains(-1) || !arr.contains(1)) {
      return 0
    }

    var sum = 0
    var globalMax = 0
    var haveNegative = false

    arr.forEach {
      sum += it

      if (it < 0) {
        haveNegative = true
      }

      globalMax = maxOf(globalMax, sum - if (haveNegative) 0 else 1)

      if (sum < 0) {
        sum = 0
        haveNegative = false
      }
    }

    return globalMax
  }
}
