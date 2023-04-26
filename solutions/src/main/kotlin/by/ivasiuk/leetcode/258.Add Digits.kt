package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/add-digits/">Add Digits</a>
 */
class AddDigits {
  fun addDigits(num: Int) =
    when {
      num == 0 -> 0
      num % 9 == 0 -> 9
      else -> num % 9
    }
}
