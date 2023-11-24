package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindClosestNodeToGivenTwoNodesTest {
  private val solution = FindClosestNodeToGivenTwoNodes()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.closestMeetingNode(
        edges = intArrayOf(2, 2, 3, -1),
        node1 = 0,
        node2 = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.closestMeetingNode(
        edges = intArrayOf(1, 2, -1),
        node1 = 0,
        node2 = 2,
      )
    )
  }
}
