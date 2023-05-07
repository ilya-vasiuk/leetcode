package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindTheLongestValidObstacleCourseAtEachPositionTest {
  private val solution = FindTheLongestValidObstacleCourseAtEachPosition()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 3, 3),
      actual = solution.longestObstacleCourseAtEachPosition(
        obstacles = intArrayOf(1, 2, 3, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 1),
      actual = solution.longestObstacleCourseAtEachPosition(
        obstacles = intArrayOf(2, 2, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(1, 1, 2, 3, 2, 2),
      actual = solution.longestObstacleCourseAtEachPosition(
        obstacles = intArrayOf(3, 1, 5, 6, 4, 2)
      )
    )
  }
}
