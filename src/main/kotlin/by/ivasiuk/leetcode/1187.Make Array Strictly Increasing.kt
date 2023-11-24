package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/make-array-strictly-increasing/">
 *   Make Array Strictly Increasing</a>
 */
class MakeArrayStrictlyIncreasing {
  private lateinit var a: IntArray
  private lateinit var b: IntArray
  private val dp = hashMapOf<Pair<Int, Int>, Int>()

  private fun check(idx: Int, p: Int): Int {
    if (idx == a.size) {
      return 0
    }

    val key = Pair(idx, p)

    if (dp.containsKey(key)) {
      return dp[key]!!
    }

    var ans = 100_001

    if (a[idx] <= p) {
      val newVal = getNextSmallestGreater(p)

      if (newVal != -1) {
        ans = 1 + check(idx + 1, newVal)
      }
    } else {
      val next = getNextSmallestGreater(p)
      val replace = if (next != -1) {
        1 + check(idx + 1, next)
      } else {
        100_001
      }
      val noReplace = check(idx + 1, a[idx])
      ans = minOf(replace, noReplace)
    }

    dp[key] = ans

    return ans
  }

  private fun getNextSmallestGreater(value: Int): Int {
    var low = 0
    var high = b.lastIndex
    var ans = -1

    while (low <= high) {
      val mid = (low + high) / 2

      if (b[mid] > value) {
        ans = b[mid]
        high = mid - 1
      } else {
        low = mid + 1
      }
    }

    return ans
  }

  fun makeArrayIncreasing(arr1: IntArray, arr2: IntArray): Int {
    a = arr1
    b = arr2.sortedArray()

    return check(0, -1).takeIf { it < 100_001 } ?: -1
  }
}
