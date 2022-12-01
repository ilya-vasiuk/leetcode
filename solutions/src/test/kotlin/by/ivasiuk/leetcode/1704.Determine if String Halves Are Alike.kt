package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DetermineIfStringHalvesAreAlikeTest {
  private val solution = DetermineIfStringHalvesAreAlike()

  @Test
  fun example1() {
    assertTrue {
      solution.halvesAreAlike("book")
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.halvesAreAlike("textbook")
    }
  }
}
