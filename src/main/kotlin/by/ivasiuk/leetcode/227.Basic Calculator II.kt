package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/basic-calculator-ii/">Basic Calculator II</a>
 */
class BasicCalculator2 {
  fun calculate(s: String): Int {
    val stack = Stack<Int>()
    var currentNumber = ""
    var sign = 1
    var operator: Char? = null
    val str = s.replace(Regex("\\s+"), "")

    for (i in str.indices) {
      if (str[i].isDigit()) {
        currentNumber += str[i]

        if (i < str.length - 1) {
          continue
        }
      }

      val num = currentNumber.toInt() * sign

      if (operator != null) {
        when (operator) {
          '*' -> stack.push(stack.pop() * num)
          '/' -> stack.push(stack.pop() / num)
          else -> throw IllegalStateException()
        }

        operator = null
      } else {
        stack.push(num)
        sign = 1
      }
      currentNumber = ""

      when (str[i]) {
        '-' -> sign = -1
        '+' -> sign = 1
        '*', '/' -> operator = str[i]
      }
    }

    return stack.sum()
  }
}
