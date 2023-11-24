package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class WordsWithinTwoEditsOfDictionaryTest {
  private val solution = WordsWithinTwoEditsOfDictionary()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("word", "note", "wood"),
      actual = solution.twoEditWords(
        queries = arrayOf("word", "note", "ants", "wood"),
        dictionary = arrayOf("wood", "joke", "moat")
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = emptyList(),
      actual = solution.twoEditWords(
        queries = arrayOf("yes"),
        dictionary = arrayOf("not")
      )
    )
  }

  //["tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"]
  //["uyj","bug","dba","xbe","blu","wuo","tsf","tga"]
  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf("tsl","yyy","rbc","dda","qus","hyb","ilu"),
      actual = solution.twoEditWords(
        queries = arrayOf("tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"),
        dictionary = arrayOf("uyj","bug","dba","xbe","blu","wuo","tsf","tga")
      )
    )
  }
}