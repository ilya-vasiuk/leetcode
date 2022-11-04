package by.ivasiuk.leetcode

import kotlin.test.*

class PermutationsTest {
  val solution = Permutations()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(1, 2, 3),
      listOf(1, 3, 2),
      listOf(2, 1, 3),
      listOf(2, 3, 1),
      listOf(3, 1, 2),
      listOf(3, 2, 1),
    )
    val actual = solution.permute(
      nums = intArrayOf(1, 2, 3)
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(0, 1),
      listOf(1, 0),
    )
    val actual = solution.permute(
      nums = intArrayOf(0, 1)
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }

  @Test
  fun example3() {
    val expected = listOf(
      listOf(1),
    )
    val actual = solution.permute(
      nums = intArrayOf(1)
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }
}