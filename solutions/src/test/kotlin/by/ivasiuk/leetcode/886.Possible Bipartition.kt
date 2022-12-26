package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PossibleBipartitionTest {
  private val solution = PossibleBipartition()

  @Test
  fun example1() {
    assertTrue {
      solution.possibleBipartition(
        n = 4,
        dislikes = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(1, 3),
          intArrayOf(2, 4),
        )
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.possibleBipartition(
        n = 3,
        dislikes = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(1, 3),
          intArrayOf(2, 3),
        )
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.possibleBipartition(
        n = 5,
        dislikes = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
          intArrayOf(4, 5),
          intArrayOf(5, 1),
        )
      )
    }
  }
}
