package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateStackSequencesTest {
  private val solution = ValidateStackSequences()

  @Test
  fun example1() {
    assertTrue {
      solution.validateStackSequences(
        pushed = intArrayOf(1, 2, 3, 4, 5),
        popped = intArrayOf(4, 5, 3, 2, 1),
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.validateStackSequences(
        pushed = intArrayOf(1, 2, 3, 4, 5),
        popped = intArrayOf(4, 3, 5, 1, 2),
      )
    }
  }
}
