package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/happy-number/">
 *   Happy Number</a>
 */
class HappyNumber {
  fun isHappy(n: Int): Boolean {
    var current = n
    val steps = mutableSetOf<Int>()

    while (current != 1) {
      val digits = current.toString()

      current = 0
      for (d in digits) {
        val digit = Character.getNumericValue(d)
        current += digit * digit
      }

      if (steps.contains(current)) {
        return false
      }

      steps.add(current)
    }

    return true
  }
}