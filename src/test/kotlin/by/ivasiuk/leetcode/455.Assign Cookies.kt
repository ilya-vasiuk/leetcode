package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class AssignCookiesTest {
  private val solution = AssignCookies()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.findContentChildren(
        g = intArrayOf(1, 2, 3),
        s = intArrayOf(1, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.findContentChildren(
        g = intArrayOf(1, 2),
        s = intArrayOf(1, 2, 3)
      )
    )
  }
}
