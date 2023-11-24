package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SimplifyPathTest {
  private val solution = SimplifyPath()

  @Test
  fun example1() {
    assertEquals(
      expected = "/home",
      actual = solution.simplifyPath(
        path = "/home/"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "/",
      actual = solution.simplifyPath(
        path = "/../"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "/home/foo",
      actual = solution.simplifyPath(
        path = "/home//foo/"
      )
    )
  }
}
