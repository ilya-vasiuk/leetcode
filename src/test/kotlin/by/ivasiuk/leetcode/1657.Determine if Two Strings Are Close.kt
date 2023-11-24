package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DetermineIfTwoStringsAreCloseTest {
  private val solution = DetermineIfTwoStringsAreClose()

  @Test
  fun example1() {
    assertTrue {
      solution.closeStrings(
        word1 = "abc",
        word2 = "bca",
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.closeStrings(
        word1 = "a",
        word2 = "aa",
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.closeStrings(
        word1 = "cabbba",
        word2 = "abbccc",
      )
    }
  }
}
