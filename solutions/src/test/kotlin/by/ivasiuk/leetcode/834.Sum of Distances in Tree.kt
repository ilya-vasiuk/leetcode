package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SumOfDistancesInTreeTest {
  private val solution = SumOfDistancesInTree()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(8, 12, 6, 10, 10, 10),
      actual = solution.sumOfDistancesInTree(
        n = 6,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(2, 3),
          intArrayOf(2, 4),
          intArrayOf(2, 5),
        ),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0),
      actual = solution.sumOfDistancesInTree(
        n = 1,
        edges = arrayOf(),
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(1, 1),
      actual = solution.sumOfDistancesInTree(
        n = 2,
        edges = arrayOf(
          intArrayOf(1, 0),
        ),
      )
    )
  }
}
