package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NumberOfFlowersInFullBloomTest {
  private val solution = NumberOfFlowersInFullBloom()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 2, 2),
      actual = solution.fullBloomFlowers(
        flowers = arrayOf(
          intArrayOf(1, 6),
          intArrayOf(3, 7),
          intArrayOf(9, 12),
          intArrayOf(4, 13),
        ),
        people = intArrayOf(2, 3, 7, 11),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(2, 2, 1),
      actual = solution.fullBloomFlowers(
        flowers = arrayOf(
          intArrayOf(1, 10),
          intArrayOf(3, 3),
        ),
        people = intArrayOf(3, 3, 2),
      )
    )
  }
}
