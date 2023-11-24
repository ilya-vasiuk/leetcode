package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {
  private val solution = GroupThePeopleGivenTheGroupSizeTheyBelongTo()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(0, 1, 2),
        listOf(5),
        listOf(3, 4, 6),
      ),
      actual = solution.groupThePeople(
        groupSizes = intArrayOf(3, 3, 3, 3, 3, 1, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1),
        listOf(2, 3, 4),
        listOf(0, 5),
      ),
      actual = solution.groupThePeople(
        groupSizes = intArrayOf(2, 1, 3, 3, 3, 2)
      )
    )
  }
}
