package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BulbSwitcherTest {
  private val solution = BulbSwitcher()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.bulbSwitch(
        n = 0
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.bulbSwitch(
        n = 1
      )
    )
  }
}
