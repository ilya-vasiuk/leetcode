package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class WordSearch2Test {
  private val solution = WordSearch2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("oath", "eat"),
      actual = solution.findWords(
        board = arrayOf(
          charArrayOf('o', 'a', 'a', 'n'),
          charArrayOf('e', 't', 'a', 'e'),
          charArrayOf('i', 'h', 'k', 'r'),
          charArrayOf('i', 'f', 'l', 'v'),
        ),
        words = arrayOf("oath", "pea", "eat", "rain")
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = emptyList(),
      actual = solution.findWords(
        board = arrayOf(
          charArrayOf('a', 'b'),
          charArrayOf('c', 'd'),
        ),
        words = arrayOf("abcb")
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf("a"),
      actual = solution.findWords(
        board = arrayOf(
          charArrayOf('a'),
        ),
        words = arrayOf("a")
      )
    )
  }

  @Test
  fun example4() {
    assertContentEquals(
      expected = listOf("oa", "oaa"),
      actual = solution.findWords(
        board = arrayOf(
          charArrayOf('o', 'a', 'a'),
        ),
        words = arrayOf("oa", "oaa")
      )
    )
  }
}