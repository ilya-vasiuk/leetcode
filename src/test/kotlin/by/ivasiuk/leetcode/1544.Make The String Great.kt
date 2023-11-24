package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MakeTheStringGreatTest {
  private val solution = MakeTheStringGreat()

  @Test
  fun example1() {
    assertEquals(
      expected = "leetcode",
      actual = solution.makeGood(
        s = "leEeetcode"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "",
      actual = solution.makeGood(
        s = "abBAcC"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "s",
      actual = solution.makeGood(
        s = "s"
      )
    )
  }
}
