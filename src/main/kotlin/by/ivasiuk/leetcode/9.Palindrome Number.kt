package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a>
 */
class PalindromeNumber {
  fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
      return false
    }

    var num = x
    var reversed = 0

    while (num > 0) {
      reversed = reversed * 10 + num % 10
      num /= 10
    }

    return reversed == x
  }
}
