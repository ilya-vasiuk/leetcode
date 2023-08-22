package by.ivasiuk.leetcode

import kotlin.text.StringBuilder

/**
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/">
 *   Excel Sheet Column Title</a>
 */
class ExcelSheetColumnTitle {
  fun convertToTitle(columnNumber: Int): String {
    val result = StringBuilder()
    var carry = columnNumber

    while (carry-- > 0) {
      result.append('A' + carry % 26)
      carry /= 26
    }

    return result.reverse().toString()
  }
}
