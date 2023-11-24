package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ScrambleStringTest {
  private val solution = ScrambleString()

  @Test
  fun example1() {
    assertTrue {
      solution.isScramble(
        s1 = "great",
        s2 = "rgeat"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isScramble(
        s1 = "abcde",
        s2 = "caebd"
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.isScramble(
        s1 = "a",
        s2 = "a"
      )
    }
  }
}
