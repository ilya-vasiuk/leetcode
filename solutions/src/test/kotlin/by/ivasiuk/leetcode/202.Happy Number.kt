package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HappyNumberTest {
  private val solution = HappyNumber()

  @Test
  fun example1() {
    assertTrue {
      solution.isHappy(19)
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isHappy(2)
    }
  }
}