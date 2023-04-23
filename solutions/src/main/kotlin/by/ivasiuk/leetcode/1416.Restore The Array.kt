package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/restore-the-array/">Restore The Array</a>
 */
class RestoreTheArray {
  fun numberOfArrays(s: String, k: Int): Int {
    val n = s.length
    val m = k.toString().length
    val options = IntArray(n + 1)
      .also { it[n] = 1 }

    for (i in n - 1 downTo 0) {
      if (s[i] != '0') {
        var num = 0
        var j = i

        while (j < n && j - i + 1 <= m && s.substring(i, j + 1).toLong() <= k) {
          num = (num + options[1 + j++]) % MODULO
        }

        options[i] = num
      }
    }

    return options.first()
  }

  companion object {
    private const val MODULO = 1_000_000_007
  }
}
