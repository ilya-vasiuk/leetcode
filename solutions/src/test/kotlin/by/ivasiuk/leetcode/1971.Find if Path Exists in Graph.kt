package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FindIfPathExistsInGraphTest {
  private val solution = FindIfPathExistsInGraph()

  @Test
  fun example1() {
    assertTrue {
      solution.validPath(
        n = 3,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 0),
        ),
        source = 0,
        destination = 2,
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.validPath(
        n = 6,
        edges = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(3, 5),
          intArrayOf(5, 4),
          intArrayOf(4, 3),
        ),
        source = 0,
        destination = 5,
      )
    }
  }
}
