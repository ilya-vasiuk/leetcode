package by.ivasiuk.leetcode

import kotlin.test.*

class DetermineIfACellIsReachableAtAGivenTimeTest {
  private val solution = DetermineIfACellIsReachableAtAGivenTime()

  @Test
  fun example1() {
    assertTrue {
      solution.isReachableAtTime(
        sx = 2,
        sy = 4,
        fx = 7,
        fy = 7,
        t = 6
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isReachableAtTime(
        sx = 3,
        sy = 1,
        fx = 7,
        fy = 3,
        t = 3
      )
    }
  }
}
