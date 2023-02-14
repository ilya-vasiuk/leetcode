package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/add-binary/">Add Binary</a>
 */
class AddBinary {
  fun addBinary(a: String, b: String): String {
    val result = StringBuilder()
    var carry = 0
    var i = 0

    while (carry != 0 || i < a.length || i < b.length) {
      val x = if (i < a.length) a[a.length - i - 1] - '0' else 0
      val y = if (i < b.length) b[b.length - i - 1] - '0' else 0

      result.insert(0, (x + y + carry) % 2)
      carry = (x + y + carry) / 2
      i++
    }

    return result.toString()
  }
}
