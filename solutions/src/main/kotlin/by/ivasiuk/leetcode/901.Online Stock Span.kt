package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/online-stock-span/">Online Stock Span</a>
 */
class StockSpanner {
  val stack = Stack<Pair<Int, Int>>()

  fun next(price: Int): Int {
    var days = 1

    while (stack.isNotEmpty() && stack.peek().first <= price) {
      days += stack.pop().second
    }

    return stack.push(Pair(price, days)).second
  }
}
