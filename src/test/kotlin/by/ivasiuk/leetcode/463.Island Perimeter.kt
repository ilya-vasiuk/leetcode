package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class IslandPerimeterTest {
  private val solution = IslandPerimeter()

  @Test
  fun example1() {
    assertEquals(
      expected = 16,
      actual = solution.islandPerimeter(
        grid = arrayOf(
          intArrayOf(0, 1, 0, 0),
          intArrayOf(1, 1, 1, 0),
          intArrayOf(0, 1, 0, 0),
          intArrayOf(1, 1, 0, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.islandPerimeter(
        grid = arrayOf(
          intArrayOf(1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.islandPerimeter(
        grid = arrayOf(
          intArrayOf(1, 0),
        )
      )
    )
  }
}
