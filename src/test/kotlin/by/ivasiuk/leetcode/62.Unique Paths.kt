package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class UniquePathsTest {
  private val solution = UniquePaths()

  @Test
  fun example1() {
    assertEquals(
      expected = 28,
      actual = solution.uniquePaths(3, 7)
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.uniquePaths(3, 2)
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 86493225,
      actual = solution.uniquePaths(19, 13)
    )
  }
}
