package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VerifyingAnAlienDictionaryTest {
  private val solution = VerifyingAnAlienDictionary()

  @Test
  fun example1() {
    assertTrue {
      solution.isAlienSorted(
        words = arrayOf(
          "hello",
          "leetcode"
        ),
        order = "hlabcdefgijkmnopqrstuvwxyz"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isAlienSorted(
        words = arrayOf(
          "word",
          "world",
          "row"
        ),
        order = "worldabcefghijkmnpqstuvxyz"
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isAlienSorted(
        words = arrayOf(
          "apple",
          "app"
        ),
        order = "abcdefghijklmnopqrstuvwxyz"
      )
    }
  }
}
