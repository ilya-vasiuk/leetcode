package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/basic-calculator/">Basic Calculator</a>
 */
class BasicCalculator {
  fun calculate(s: String): Int {
    val stack = Stack<Int>()
    val signStack = Stack<Boolean>()
    var sign = true
    var brackets = true
    var i = 0

    while (i < s.length) {
      when (s[i]) {
        '(' -> {
          signStack.push(sign)
          sign = true
          brackets = true
        }
        ')' -> {
          val inBrackets = stack.pop() * if (signStack.pop()) 1 else -1
          stack.push(inBrackets + if(stack.isEmpty()) 0 else stack.pop())
        }
        '+' -> sign = true
        '-' -> {
          sign = false
          if (brackets) {
            stack.push(0)
            brackets = false
          }
        }
        in '0'..'9' -> {
          var currentNumber = ""
          while (i < s.length && s[i].isDigit()) {
            currentNumber += s[i++]
          }
          val num = currentNumber.toInt() * if (sign) 1 else -1

          if (brackets) {
            stack.push(num)
            brackets = false
          } else {
            stack.push(num + if(stack.isEmpty()) 0 else stack.pop())
          }

          i--
        }
      }

      i++
    }

    return stack.pop()
  }
}
