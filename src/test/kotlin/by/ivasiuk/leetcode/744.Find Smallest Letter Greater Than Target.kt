package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindSmallestLetterGreaterThanTargetTest {
  private val solution = FindSmallestLetterGreaterThanTarget()

  @Test
  fun example1() {
    assertEquals(
      expected = 'c',
      actual = solution.nextGreatestLetter(
        letters = charArrayOf('c', 'f', 'j'),
        target = 'a'
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 'f',
      actual = solution.nextGreatestLetter(
        letters = charArrayOf('c', 'f', 'j'),
        target = 'c'
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 'x',
      actual = solution.nextGreatestLetter(
        letters = charArrayOf('x', 'x', 'y', 'y'),
        target = 'z'
      )
    )
  }
}
