package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCycleInAGraphTest {
  private val solution = LongestCycleInAGraph()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.longestCycle(
        edges = intArrayOf(3, 3, 4, 2, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.longestCycle(
        edges = intArrayOf(2, -1, 3, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.longestCycle(
        edges = intArrayOf(3,4,0,2,-1,2)
      )
    )
  }
}
