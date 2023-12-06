package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/calculate-money-in-leetcode-bank/">
 *   Calculate Money in Leetcode Bank</a>
 */
class CalculateMoneyInLeetcodeBank {
  fun totalMoney(n: Int): Int {
    var curr = 1
    var growth = 0
    var result = 0

    repeat(n) {
      result += growth + curr

      if (curr++ == 7) {
        curr = 1
        growth++
      }
    }

    return result
  }
}
