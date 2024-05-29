package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfStepsToReduceANumberInBinaryRepresentationToOneTest {
  private val solution = NumberOfStepsToReduceANumberInBinaryRepresentationToOne()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numSteps(
        s = "1101",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.numSteps(
        s = "10",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numSteps(
        s = "1",
      )
    )
  }
}
