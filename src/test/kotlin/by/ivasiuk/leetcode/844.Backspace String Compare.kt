package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BackspaceStringCompareTest {
  private val solution = BackspaceStringCompare()

  @Test
  fun example1() {
    assertTrue {
      solution.backspaceCompare("ab#c", "ad#c")
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.backspaceCompare("ab##", "c#d#")
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.backspaceCompare("a#c", "b")
    }
  }
}