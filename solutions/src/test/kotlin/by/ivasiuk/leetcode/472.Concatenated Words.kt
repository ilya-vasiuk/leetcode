package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ConcatenatedWordsTest {
  private val solution = ConcatenatedWords()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("catsdogcats", "dogcatsdog", "ratcatdogcat"),
      actual = solution.findAllConcatenatedWordsInADict(
        words = arrayOf("cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat")
      ).sorted()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("catdog"),
      actual = solution.findAllConcatenatedWordsInADict(
        words = arrayOf("cat", "dog", "catdog")
      )
    )
  }
}
