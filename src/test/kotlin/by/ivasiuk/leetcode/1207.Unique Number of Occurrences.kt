package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class UniqueNumberOfOccurrencesTest {
  private val solution = UniqueNumberOfOccurrences()

  @Test
  fun example1() {
    assertTrue {
      solution.uniqueOccurrences(
        arr = intArrayOf(1, 2, 2, 1, 1, 3)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.uniqueOccurrences(
        arr = intArrayOf(1, 2)
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.uniqueOccurrences(
        arr = intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)
      )
    }
  }
}
