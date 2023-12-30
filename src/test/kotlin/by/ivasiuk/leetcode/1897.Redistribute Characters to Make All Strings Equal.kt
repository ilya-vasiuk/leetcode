package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RedistributeCharactersToMakeAllStringsEqualTest {
  private val solution = RedistributeCharactersToMakeAllStringsEqual()

  @Test
  fun example1() {
    assertTrue {
      solution.makeEqual(
        words = arrayOf("abc", "aabc", "bc"),
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.makeEqual(
        words = arrayOf("ab", "a"),
      )
    }
  }
}
