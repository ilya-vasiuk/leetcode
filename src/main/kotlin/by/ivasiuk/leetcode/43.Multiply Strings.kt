package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/multiply-strings/">
 *   Multiply Strings</a>
 */
class MultiplyStrings {
  fun multiply(num1: String, num2: String): String {
    if (num2.length > num1.length) {
      return multiply(num2, num1)
    }
    val n1 = num1.reversed()
    val n2 = num2.reversed()

    var result = "0"
    for (i in n2.indices) {
      result = sum(result, multiply(n1, Character.getNumericValue(n2[i])), i)
    }

    return result.reversed()
  }

  private fun multiply(num: String, digit: Int): String {
    if (digit == 0) {
      return "0"
    }
    if (digit == 1) {
      return num
    }

    val product = mutableListOf<Int>()

    var carry = 0
    var i = 0
    while (i < num.length || carry != 0) {
      val a = if (i < num.length) Character.getNumericValue(num[i]) else 0
      val current = a * digit + carry
      product.add(current % 10)
      carry = current / 10
      i++
    }

    return product.joinToString("") { it.toString() }
  }

  private fun sum(num1: String, num2: String, shift: Int): String {
    val sum = mutableListOf<Int>()

    var carry = 0
    var i = 0
    while (i < num1.length || i - shift < num2.length || carry != 0) {
      val a = if (i < num1.length) Character.getNumericValue(num1[i]) else 0
      val b = if (i - shift >= 0 && i - shift < num2.length) Character.getNumericValue(num2[i - shift]) else 0
      val current = a + b + carry
      sum.add(current % 10)
      carry = current / 10
      i++
    }

    return sum.joinToString("") { it.toString() }
  }
}