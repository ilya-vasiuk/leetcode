package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfIslandsTest {
  private val solution = NumberOfIslands()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numIslands(
        grid = arrayOf(
          charArrayOf('1','1','1','1','0'),
          charArrayOf('1','1','0','1','0'),
          charArrayOf('1','1','0','0','0'),
          charArrayOf('0','0','0','0','0'),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.numIslands(
        grid = arrayOf(
          charArrayOf('1','1','0','0','0'),
          charArrayOf('1','1','0','0','0'),
          charArrayOf('0','0','1','0','0'),
          charArrayOf('0','0','0','1','1'),
        )
      )
    )
  }
}