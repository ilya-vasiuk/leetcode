package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsSubsequenceTest {
  private val solution = IsSubsequence()

  @Test
  fun example1() {
    assertTrue {
      solution.isSubsequence(
        s = "abc",
        t = "ahbgdc",
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isSubsequence(
        s = "axc",
        t = "ahbgdc",
      )
    }
  }
}
