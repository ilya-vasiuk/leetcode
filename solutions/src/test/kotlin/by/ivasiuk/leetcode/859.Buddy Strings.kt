package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BuddyStringsTest {
  private val solution = BuddyStrings()

  @Test
  fun example1() {
    assertTrue {
      solution.buddyStrings(
        s = "ab",
        goal = "ba",
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.buddyStrings(
        s = "ab",
        goal = "ab",
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.buddyStrings(
        s = "aa",
        goal = "aa",
      )
    }
  }
}
