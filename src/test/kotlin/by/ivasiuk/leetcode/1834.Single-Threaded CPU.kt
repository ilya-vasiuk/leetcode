package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SingleThreadedCPUTest {
  private val solution = SingleThreadedCPU()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 2, 3, 1),
      actual = solution.getOrder(
        tasks = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 4),
          intArrayOf(3, 2),
          intArrayOf(4, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(4, 3, 2, 0, 1),
      actual = solution.getOrder(
        tasks = arrayOf(
          intArrayOf(7, 10),
          intArrayOf(7, 12),
          intArrayOf(7, 5),
          intArrayOf(7, 4),
          intArrayOf(7, 2),
        )
      )
    )
  }
}
