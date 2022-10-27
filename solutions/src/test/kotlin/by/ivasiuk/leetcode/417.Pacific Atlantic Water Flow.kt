package by.ivasiuk.leetcode

import kotlin.test.*

class PacificAtlanticWaterFlowTest {
  private val solution = PacificAtlanticWaterFlow()

  @Test
  fun example1() {
    val heights = arrayOf(
      intArrayOf(1,2,2,3,5),
      intArrayOf(3,2,3,4,4),
      intArrayOf(2,4,5,3,1),
      intArrayOf(6,7,1,4,5),
      intArrayOf(5,1,1,2,4),
    )
    val expected = listOf(
      listOf(0,4),
      listOf(1,3),
      listOf(1,4),
      listOf(2,2),
      listOf(3,0),
      listOf(3,1),
      listOf(4,0),
    )
    val result = solution.pacificAtlantic(heights)

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }

  @Test
  fun example2() {
    val heights = arrayOf(intArrayOf(1))
    val expected = listOf(listOf(0,0))
    val result = solution.pacificAtlantic(heights)

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }
}