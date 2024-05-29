package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/">
 *   Number of Steps to Reduce a Number in Binary Representation to One</a>
 */
class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {
  fun numSteps(s: String): Int {
    val len = s.length
    var carry = 0
    var result = 0

    for (i in len - 1 downTo 1) {
      val ch = s[i]

      if (ch == '1') {
        if (carry == 0) {
          result += 2
          carry = 1
        } else {
          result++
        }
      } else {
        if (carry == 0) {
          result++
        } else {
          result += 2
        }
      }
    }

    return result + carry
  }
}
