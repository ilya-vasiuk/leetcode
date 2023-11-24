package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CanMakeArithmeticProgressionFromSequenceTest {
  private val solution = CanMakeArithmeticProgressionFromSequence()

  @Test
  fun example1() {
    assertTrue {
      solution.canMakeArithmeticProgression(
        arr = intArrayOf(3, 5, 1)
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canMakeArithmeticProgression(
        arr = intArrayOf(1, 2, 4)
      )
    }
  }
}
