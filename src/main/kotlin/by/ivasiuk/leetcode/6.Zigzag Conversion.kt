package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/">
 *   Zigzag Conversion</a>
 */
class ZigzagConversion {
  fun convert(s: String, numRows: Int): String {
    if (numRows == 1) {
      return s
    }

    val k = 2 * (numRows - 1)
    val result = StringBuilder()

    for (i in 0 until numRows) {
      var index = i
      while (index < s.length) {
        result.append(s[index])

        if (i != 0 && i != numRows - 1) {
          val k1 = k - 2 * i
          val k2 = index + k1

          if (k2 < s.length) {
            result.append(s[k2])
          }
        }
        index += k
      }
    }

    return result.toString()
  }
}
