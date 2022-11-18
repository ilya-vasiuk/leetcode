package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class UglyNumberTest {
  private val solution = UglyNumber()

  @Test
  fun example1() {
    assertTrue {
      solution.isUgly(
        n = 6
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isUgly(
        n = 1
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isUgly(
        n = 14
      )
    }
  }

  @Test
  fun example4() {
    assertFalse {
      solution.isUgly(
        n = 0
      )
    }
  }
}
