package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindFirstPalindromicStringInTheArrayTest {
  private val solution = FindFirstPalindromicStringInTheArray()

  @Test
  fun example1() {
    assertEquals(
      expected = "ada",
      actual = solution.firstPalindrome(
        words = arrayOf("abc", "car", "ada", "racecar", "cool")
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "racecar",
      actual = solution.firstPalindrome(
        words = arrayOf("notapalindrome", "racecar")
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "",
      actual = solution.firstPalindrome(
        words = arrayOf("def", "ghi")
      )
    )
  }
}
