package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumNumberOfAchievableTransferRequestsTest {
  private val solution = MaximumNumberOfAchievableTransferRequests()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.maximumRequests(
        n = 5,
        requests = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 0),
          intArrayOf(0, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 0),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maximumRequests(
        n = 3,
        requests = arrayOf(
          intArrayOf(0, 0),
          intArrayOf(1, 2),
          intArrayOf(2, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.maximumRequests(
        n = 4,
        requests = arrayOf(
          intArrayOf(0, 3),
          intArrayOf(3, 1),
          intArrayOf(1, 2),
          intArrayOf(2, 0),
        )
      )
    )
  }
}
