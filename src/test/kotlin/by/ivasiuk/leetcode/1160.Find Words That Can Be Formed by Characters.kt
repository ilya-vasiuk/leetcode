package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindWordsThatCanBeFormedByCharactersTest {
  private val solution = FindWordsThatCanBeFormedByCharacters()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.countCharacters(
        words = arrayOf("cat", "bt", "hat", "tree"),
        chars = "atach"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.countCharacters(
        words = arrayOf("hello", "world", "leetcode"),
        chars = "welldonehoneyr"
      )
    )
  }
}
