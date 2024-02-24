package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindAllPeopleWithSecretTest {
  private val solution = FindAllPeopleWithSecret()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(0, 1, 2, 3, 5),
      actual = solution.findAllPeople(
        n = 6,
        meetings = arrayOf(
          intArrayOf(1, 2, 5),
          intArrayOf(2, 3, 8),
          intArrayOf(1, 5, 10),
        ),
        firstPerson = 1
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(0, 1, 3),
      actual = solution.findAllPeople(
        n = 4,
        meetings = arrayOf(
          intArrayOf(3, 1, 3),
          intArrayOf(1, 2, 2),
          intArrayOf(0, 3, 3),
        ),
        firstPerson = 3
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(0, 1, 2, 3, 4),
      actual = solution.findAllPeople(
        n = 5,
        meetings = arrayOf(
          intArrayOf(3, 4, 2),
          intArrayOf(1, 2, 1),
          intArrayOf(2, 3, 1),
        ),
        firstPerson = 1
      )
    )
  }
}
