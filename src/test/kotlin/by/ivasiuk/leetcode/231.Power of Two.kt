package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class PowerOfTwoTest {
  private val solution = PowerOfTwo()

  @Test
  fun example1() {
    assertTrue {
      solution.isPowerOfTwo(1)
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isPowerOfTwo(16)
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isPowerOfTwo(3)
    }
  }
}
