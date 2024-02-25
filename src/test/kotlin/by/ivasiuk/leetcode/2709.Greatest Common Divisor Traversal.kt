package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GreatestCommonDivisorTraversalTest {
  private val solution = GreatestCommonDivisorTraversal()

  @Test
  fun example1() {
    assertTrue {
      solution.canTraverseAllPairs(
        nums = intArrayOf(2, 3, 6)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canTraverseAllPairs(
        nums = intArrayOf(3, 9, 5)
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.canTraverseAllPairs(
        nums = intArrayOf(4, 3, 12, 8)
      )
    }
  }
}
