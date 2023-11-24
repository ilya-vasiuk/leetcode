package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
  private val solution = ContainsDuplicate()

  @Test
  fun example1() {
    assertTrue {
      solution.containsDuplicate(intArrayOf(1, 2, 3, 1))
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.containsDuplicate(intArrayOf(1, 2, 3, 4))
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
    }
  }
}