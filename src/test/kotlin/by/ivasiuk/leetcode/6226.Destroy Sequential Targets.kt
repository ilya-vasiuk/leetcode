package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DestroySequentialTargetsTest {
  private val solution = DestroySequentialTargets()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.destroyTargets(
        nums = intArrayOf(3, 7, 8, 1, 1, 5),
        space = 2
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.destroyTargets(
        nums = intArrayOf(1, 3, 5, 2, 4, 6),
        space = 2
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.destroyTargets(
        nums = intArrayOf(6, 2, 5),
        space = 100
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 2,
      actual = solution.destroyTargets(
        nums = intArrayOf(1, 5, 3, 2, 2),
        space = 10000
      )
    )
  }
}