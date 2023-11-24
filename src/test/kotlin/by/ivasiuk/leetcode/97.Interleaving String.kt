package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InterleavingStringTest {
  private val solution = InterleavingString()

  @Test
  fun example1() {
    assertTrue {
      solution.isInterleave(
        s1 = "aabcc",
        s2 = "dbbca",
        s3 = "aadbbcbcac"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isInterleave(
        s1 = "aabcc",
        s2 = "dbbca",
        s3 = "aadbbbaccc"
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.isInterleave(
        s1 = "",
        s2 = "",
        s3 = ""
      )
    }
  }
}
