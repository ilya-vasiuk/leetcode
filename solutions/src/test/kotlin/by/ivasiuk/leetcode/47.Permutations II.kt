package by.ivasiuk.leetcode

import kotlin.test.*

class Permutations2Test {
  val solution = Permutations2()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(1, 1, 2),
      listOf(1, 2, 1),
      listOf(2, 1, 1),
    )
    val actual = solution.permuteUnique(
      nums = intArrayOf(1, 1, 2)
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(1, 2, 3),
      listOf(1, 3, 2),
      listOf(2, 1, 3),
      listOf(2, 3, 1),
      listOf(3, 1, 2),
      listOf(3, 2, 1),
    )
    val actual = solution.permuteUnique(
      nums = intArrayOf(1, 2, 3)
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }
}