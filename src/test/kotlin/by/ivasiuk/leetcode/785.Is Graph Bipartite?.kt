package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsGraphBipartiteTest {
  private val solution = IsGraphBipartite()

  @Test
  fun example1() {
    assertFalse {
      solution.isBipartite(
        graph = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(0, 2),
          intArrayOf(0, 1, 3),
          intArrayOf(0, 2),
        )
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isBipartite(
        graph = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(0, 2),
          intArrayOf(1, 3),
          intArrayOf(0, 2),
        )
      )
    }
  }
}
