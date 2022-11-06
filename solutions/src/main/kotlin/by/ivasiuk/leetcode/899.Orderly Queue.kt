package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/orderly-queue/">Orderly Queue</a>
 */
class OrderlyQueue {
  fun orderlyQueue(s: String, k: Int): String =
    if (k > 1) {
      s.toCharArray().sorted().joinToString("")
    } else {
      s.indices.minOf { i -> s.substring(i) + s.substring(0, i) }
    }
}
