package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-69-number/">Maximum 69 Number</a>
 */
class Maximum69Number {
  fun maximum69Number (num: Int): Int {
    val base = 10

    for (i in 3 downTo 0) {
      if (num.rem(base.pow(i + 1)) / base.pow(i) == 6) {
        return num + 3 * base.pow(i)
      }
    }

    return num
  }

  private fun Int.pow(n: Int): Int {
    var result = 1

    for (i in 0 until n) {
      result *= this
    }

    return result
  }
}
