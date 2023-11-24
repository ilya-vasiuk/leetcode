package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/n-th-tribonacci-number/">
 *   N-th Tribonacci Number</a>
 */
class NthTribonacciNumber {
  fun tribonacci(n: Int): Int {
    val numbers = intArrayOf(0, 1, 1)

    for (i in 3..n) {
      numbers[i % 3] = numbers.sum()
    }

    return numbers[n % 3]
  }
}
