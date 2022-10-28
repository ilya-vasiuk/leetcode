package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class GroupAnagramsTest {
  private val solution = GroupAnagrams()

  @Test
  fun example1() {
    val result = solution.groupAnagrams(
      arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    )
    val expected = listOf(
      listOf("bat"),
      listOf("tan", "nat"),
      listOf("eat", "tea", "ate"),
    )

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }

  @Test
  fun example2() {
    val result = solution.groupAnagrams(arrayOf(""))
    val expected = listOf(listOf(""))

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }

  @Test
  fun example3() {
    val result = solution.groupAnagrams(arrayOf("a"))
    val expected = listOf(listOf("a"))

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }
}