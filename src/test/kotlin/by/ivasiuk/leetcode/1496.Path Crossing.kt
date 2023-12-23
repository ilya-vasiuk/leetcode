package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PathCrossingTest {
  private val solution = PathCrossing()

  @Test
  fun example1() {
    assertFalse {
      solution.isPathCrossing(path = "NES")
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isPathCrossing(path = "NESWW")
    }
  }
}
