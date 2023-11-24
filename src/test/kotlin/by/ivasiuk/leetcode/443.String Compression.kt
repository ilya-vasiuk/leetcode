package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class StringCompressionTest {
  private val solution = StringCompression()

  @Test
  fun example1() {
    val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')

    assertEquals(
      expected = 6,
      actual = solution.compress(
        chars = chars
      )
    )

    assertContentEquals(
      expected = charArrayOf('a', '2', 'b', '2', 'c', '3', 'c'),
      actual = chars
    )
  }

  @Test
  fun example2() {
    val chars = charArrayOf('a')

    assertEquals(
      expected = 1,
      actual = solution.compress(
        chars = chars
      )
    )

    assertContentEquals(
      expected = charArrayOf('a'),
      actual = chars
    )
  }

  @Test
  fun example3() {
    val chars = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')

    assertEquals(
      expected = 4,
      actual = solution.compress(
        chars = chars
      )
    )

    assertContentEquals(
      expected = charArrayOf('a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'),
      actual = chars
    )
  }
}
