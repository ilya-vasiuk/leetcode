package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BoatsToSavePeopleTest {
  private val solution = BoatsToSavePeople()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numRescueBoats(
        people = intArrayOf(1, 2),
        limit = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.numRescueBoats(
        people = intArrayOf(3, 2, 2, 1),
        limit = 3
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.numRescueBoats(
        people = intArrayOf(3, 5, 3, 4),
        limit = 5
      )
    )
  }
}
