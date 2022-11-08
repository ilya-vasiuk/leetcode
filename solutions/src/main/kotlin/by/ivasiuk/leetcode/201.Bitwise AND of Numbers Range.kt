package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/bitwise-and-of-numbers-range/">
 *   Bitwise AND of Numbers Range</a>
 */
class BitwiseAndOfNumbersRange {
  fun rangeBitwiseAnd(left: Int, right: Int): Int {
    var i = left
    var j = right
    var offset = 1

    while (i != j) {
      if (i == 0) {
        return 0
      }

      i = i.shr(1)
      j = j.shr(1)
      offset = offset.shl(1)
    }

    return i * offset
  }
}

//    var width = 1
//
//    while (width < left) {
//      width *= 2
//    }
//
//    return left.and(right.rem(width))
