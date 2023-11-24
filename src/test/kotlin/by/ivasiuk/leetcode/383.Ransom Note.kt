package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RansomNoteTest {
  private val solution = RansomNote()

  @Test
  fun example1() {
    assertFalse {
      solution.canConstruct("aa", "ab")
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.canConstruct("aa", "aab")
    }
  }
}