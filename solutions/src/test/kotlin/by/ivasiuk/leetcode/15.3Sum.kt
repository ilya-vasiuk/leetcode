package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ThreeSumTest {
  private val solution = ThreeSum()

  @Test
  fun example1() {
    val result = solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    val expected = listOf(
      listOf(-1, -1, 2),
      listOf(-1, 0, 1)
    )

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }

  @Test
  fun example2() {
    val result = solution.threeSum(intArrayOf(0, 1, 1))

    assertTrue(result.isEmpty())
  }

  @Test
  fun example3() {
    val result = solution.threeSum(intArrayOf(0, 0, 0))
    val expected = listOf(
      listOf(0, 0, 0),
    )

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }
}