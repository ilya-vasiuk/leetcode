package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ShuffleTheArrayTest {
  private val solution = ShuffleTheArray()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 3, 5, 4, 1, 7),
      actual = solution.shuffle(
        nums = intArrayOf(2, 5, 1, 3, 4, 7),
        n = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 4, 2, 3, 3, 2, 4, 1),
      actual = solution.shuffle(
        nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1),
        n = 4,
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 1, 2),
      actual = solution.shuffle(
        nums = intArrayOf(1, 1, 2, 2),
        n = 2,
      )
    )
  }
}
