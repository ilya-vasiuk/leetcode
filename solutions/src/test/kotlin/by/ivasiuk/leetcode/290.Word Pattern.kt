package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordPatternTest {
  private val solution = WordPattern()

  @Test
  fun example1() {
    assertTrue {
      solution.wordPattern(
        pattern = "abba",
        s = "dog cat cat dog"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.wordPattern(
        pattern = "abba",
        s = "dog cat cat fish"
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.wordPattern(
        pattern = "aaaa",
        s = "dog cat cat dog"
      )
    }
  }
}
