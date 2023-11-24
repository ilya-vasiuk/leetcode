package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {
  private val solution = MaximumLengthOfAConcatenatedStringWithUniqueCharacters()

  @Test
  fun example1() {
    val arr = listOf("un","iq","ue")

    assertEquals(4, solution.maxLength(arr))
  }

  @Test
  fun example2() {
    val arr = listOf("cha","r","act","ers")

    assertEquals(6, solution.maxLength(arr))
  }

  @Test
  fun example3() {
    val arr = listOf("abcdefghijklmnopqrstuvwxyz")

    assertEquals(26, solution.maxLength(arr))
  }
}