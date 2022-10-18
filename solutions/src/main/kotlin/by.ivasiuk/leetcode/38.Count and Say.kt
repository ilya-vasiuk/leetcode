package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-and-say/">
 *   Count and Say</a>
 */
class CountAndSay {
  fun countAndSay(n: Int): String {
    if (n == 1) {
      return "1"
    }

    val line = countAndSay(n - 1)
    var result = ""
    var current = line[0]
    var first = 0

    for (i in 1 until line.length) {
      if (line[i] != current) {
        result = result + (i - first) + current
        current = line[i]
        first = i
      }
    }

    return result + (line.length - first) + current
  }
}