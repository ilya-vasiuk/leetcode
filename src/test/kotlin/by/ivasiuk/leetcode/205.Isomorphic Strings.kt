package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsomorphicStringsTest {
  private val solution = IsomorphicStrings()

  @Test
  fun example1() {
    assertTrue {
      solution.isIsomorphic(
        s = "egg",
        t = "add",
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isIsomorphic(
        s = "foo",
        t = "bar",
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.isIsomorphic(
        s = "paper",
        t = "title",
      )
    }
  }
}
