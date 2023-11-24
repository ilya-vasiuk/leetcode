package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveAllAdjacentDuplicatesInStringTest {
  private val solution = RemoveAllAdjacentDuplicatesInString()

  @Test
  fun example1() {
    assertEquals(
      expected = "ca",
      actual = solution.removeDuplicates("abbaca")
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "ay",
      actual = solution.removeDuplicates("azxxzy")
    )
  }
}
