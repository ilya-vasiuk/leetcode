package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumInsertionStepsToMakeAStringPalindromeTest {
  private val solution = MinimumInsertionStepsToMakeAStringPalindrome()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.minInsertions(
        s = "zzazz"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minInsertions(
        s = "mbadm"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.minInsertions(
        s = "leetcode"
      )
    )
  }
}
