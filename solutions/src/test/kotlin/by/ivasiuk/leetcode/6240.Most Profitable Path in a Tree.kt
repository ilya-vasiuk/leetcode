package by.ivasiuk.leetcode

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals

class MostProfitablePathInATreeTest {
  private val solution = MostProfitablePathInATree()

  @Test
  @Ignore
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.mostProfitablePath(
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(1, 3),
          intArrayOf(3, 4),
        ),
        bob = 3,
        amount = intArrayOf(-2, 4, 2, -4, 6)
      )
    )
  }

  @Test
  @Ignore
  fun example2() {
    assertEquals(
      expected = -7280,
      actual = solution.mostProfitablePath(
        edges = arrayOf(intArrayOf(0, 1)),
        bob = 1,
        amount = intArrayOf(-7280,2350)
      )
    )
  }
}