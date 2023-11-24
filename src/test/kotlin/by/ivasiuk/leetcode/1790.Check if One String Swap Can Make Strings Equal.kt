package by.ivasiuk.leetcode

import kotlin.test.*

class CheckIfOneStringSwapCanMakeStringsEqualTest {
  private val solution = CheckIfOneStringSwapCanMakeStringsEqual()

  @Test
  fun example1() {
    assertTrue {
      solution.areAlmostEqual(
        s1 = "bank",
        s2 = "kanb",
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.areAlmostEqual(
        s1 = "attack",
        s2 = "defend",
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.areAlmostEqual(
        s1 = "kelb",
        s2 = "kelb",
      )
    }
  }
}
