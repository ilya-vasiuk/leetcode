package by.ivasiuk.leetcode

/**
 * Default [Int.countOneBits] implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-1-bits/">
 *   Number of 1 Bits</a>
 */
class NumberOf1Bits {
  fun hammingWeight(n: Int): Int {
    var num = n

    num -= (num ushr 1 and 0x55555555)
    num = (num and 0x33333333) + (num ushr 2 and 0x33333333)
    num = num + (num ushr 4) and 0x0f0f0f0f
    num += (num ushr 8)
    num += (num ushr 16)

    return num and 0x3f
  }
}
