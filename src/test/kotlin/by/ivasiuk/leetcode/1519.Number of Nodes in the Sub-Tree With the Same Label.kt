package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NumberOfNodesInTheSubTreeWithTheSameLabelTest {
  private val solution = NumberOfNodesInTheSubTreeWithTheSameLabel()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 1, 1, 1, 1, 1, 1),
      actual = solution.countSubTrees(
        n = 7,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 4),
          intArrayOf(1, 5),
          intArrayOf(2, 3),
          intArrayOf(2, 6),
        ),
        labels = "abaedcd"
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(4, 2, 1, 1),
      actual = solution.countSubTrees(
        n = 4,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(0, 3),
        ),
        labels = "bbbb"
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(3, 2, 1, 1, 1),
      actual = solution.countSubTrees(
        n = 5,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 3),
          intArrayOf(0, 4),
        ),
        labels = "aabab"
      )
    )
  }
}
