package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KnightDialerTest {
  private val solution = KnightDialer()

  @Test
  fun example1() {
    assertEquals(
      expected = 10,
      actual = solution.knightDialer(
        pos = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 20,
      actual = solution.knightDialer(
        pos = 2
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 136006598,
      actual = solution.knightDialer(
        pos = 3131
      )
    )
  }
}
