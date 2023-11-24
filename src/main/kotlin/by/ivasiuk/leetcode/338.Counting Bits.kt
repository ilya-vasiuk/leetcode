package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/counting-bits/">Counting Bits</a>
 */
class CountingBits {
  fun countBits(n: Int): IntArray {
    val numBits = IntArray(n + 1) { 0 }
    var idx = 0
    var size = 1

    for (i in 1..n) {
      if (idx == size) {
        idx = 0
        size *= 2
      }

      numBits[i] = numBits[idx] + 1
      idx++
    }

    return numBits
  }
}
