package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfSubmatricesThatSumToTargetTest {
  private val solution = NumberOfSubmatricesThatSumToTarget()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.numSubmatrixSumTarget(
        matrix = arrayOf(
          intArrayOf(0, 1, 0),
          intArrayOf(1, 1, 1),
          intArrayOf(0, 1, 0),
        ),
        target = 0
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.numSubmatrixSumTarget(
        matrix = arrayOf(
          intArrayOf(1, -1),
          intArrayOf(-1, 1),
        ),
        target = 0
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numSubmatrixSumTarget(
        matrix = arrayOf(
          intArrayOf(904),
        ),
        target = 0
      )
    )
  }
}
