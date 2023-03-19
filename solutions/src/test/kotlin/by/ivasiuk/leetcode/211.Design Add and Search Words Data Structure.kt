package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordDictionaryTest {
  @Test
  fun example1() {
    val solution = WordDictionary()
    solution.addWord("bad")
    solution.addWord("dad")
    solution.addWord("mad")
    assertFalse { solution.search("pad") }
    assertTrue { solution.search("bad") }
    assertTrue { solution.search(".ad") }
    assertTrue { solution.search("b..") }
  }
}
