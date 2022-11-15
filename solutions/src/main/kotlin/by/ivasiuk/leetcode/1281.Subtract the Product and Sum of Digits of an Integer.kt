package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">
 *   Subtract the Product and Sum of Digits of an Integer</a>
 */
class SubtractTheProductAndSumOfDigitsOfAnInteger {
  fun subtractProductAndSum(n: Int): Int {
    var num = n
    var product = 1
    var sum = 0

    while (num > 0) {
      val digit = num % 10
      product *= digit
      sum += digit

      num /= 10
    }

    return product - sum
  }
}
