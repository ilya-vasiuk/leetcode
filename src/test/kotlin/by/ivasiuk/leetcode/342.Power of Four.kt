package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PowerOfFourTest {
  private val solution = PowerOfFour()

  @Test
  fun example1() {
    assertTrue {
      solution.isPowerOfFour(16)
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isPowerOfFour(5)
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.isPowerOfFour(1)
    }
  }
}
