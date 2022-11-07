package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class Maximum69NumberTest {
  private val solution = Maximum69Number()

  @Test
  fun example1() {
    assertEquals(
      expected = 9969,
      actual = solution.maximum69Number(
        num = 9669
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 9999,
      actual = solution.maximum69Number(
        num = 9996
      )
    )
  }
}