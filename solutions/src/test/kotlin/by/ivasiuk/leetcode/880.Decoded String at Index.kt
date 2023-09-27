package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DecodedStringAtIndexTest {
  private val solution = DecodedStringAtIndex()

  @Test
  fun example1() {
    assertEquals(
      expected = "o",
      actual = solution.decodeAtIndex(
        s = "leet2code3",
        k = 10
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "h",
      actual = solution.decodeAtIndex(
        s = "ha22",
        k = 5
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "a",
      actual = solution.decodeAtIndex(
        s = "a2345678999999999999999",
        k = 1
      )
    )
  }
}
