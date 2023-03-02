package by.ivasiuk.leetcode

import java.lang.StringBuilder

/**
 * @see <a href="https://leetcode.com/problems/string-compression/">
 *   String Compression</a>
 */
class StringCompression {
  fun compress(chars: CharArray): Int {
    val compressed = StringBuilder()
    var prev = chars[0]
    var count = 0

    for (char in chars) {
      if (char == prev) {
        count++
      } else {
        compressed.append(prev)
        if (count > 1) {
          compressed.append(count.toString())
        }

        prev = char
        count = 1
      }
    }

    compressed.append(prev)
    if (count > 1) {
      compressed.append(count.toString())
    }

    val result = compressed.toString()
    result.forEachIndexed { i, c -> chars[i] = c }

    return result.length
  }
}
