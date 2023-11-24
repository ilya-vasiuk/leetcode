package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/">
 *   Sort Integers by The Number of 1 Bits</a>
 */
class SortIntegersByTheNumberOf1Bits {
  fun sortByBits(arr: IntArray): IntArray {
    val ones = ByteArray(10001)

    arr.forEach {
      if (ones[it] == 0.toByte()) {
        ones[it] = calcOnes(it)
      }
    }

    return arr.sortedWith(compareBy({ ones[it] }, { it })).toIntArray()
  }

  private fun calcOnes(num: Int): Byte {
    var current = num
    var result: Byte = 0

    while (current > 0) {
      current = current.and(current - 1)
      result++
    }

    return result
  }
}
