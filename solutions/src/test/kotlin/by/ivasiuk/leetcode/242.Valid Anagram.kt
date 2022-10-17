package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidAnagramTest {
  private val solution = ValidAnagram()

  @Test
  fun example1() {
    assertTrue {
      solution.isAnagram("anagram", "nagaram")
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isAnagram("rat", "car")
    }
  }
}