package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class WhereWillTheBallFallTest {
  private val solution = WhereWillTheBallFall()

  @Test
  fun example1() {
    val grid = arrayOf(
      intArrayOf( 1,  1,  1, -1, -1),
      intArrayOf( 1,  1,  1, -1, -1),
      intArrayOf(-1, -1, -1,  1,  1),
      intArrayOf( 1,  1,  1,  1, -1),
      intArrayOf(-1, -1, -1, -1, -1),
    )

    val result = solution.findBall(grid)
    assertContentEquals(intArrayOf(1, -1, -1, -1, -1), result)
  }

  @Test
  fun example2() {
    val grid = arrayOf(
      intArrayOf(-1),
    )

    val result = solution.findBall(grid)
    assertContentEquals(intArrayOf(-1), result)
  }
}