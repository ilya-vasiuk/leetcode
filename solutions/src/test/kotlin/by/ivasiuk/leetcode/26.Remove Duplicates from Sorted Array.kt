package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTest {
  private val solution = RemoveDuplicatesFromSortedArray()

  @Test
  fun example1() {
    val nums = intArrayOf(1, 1, 2)
    assertEquals(
      expected = 2,
      actual = solution.removeDuplicates(
        nums = nums
      )
    )

    intArrayOf(1, 2).forEachIndexed { i, num ->
      assertEquals(nums[i], num)
    }
  }

  @Test
  fun example2() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    assertEquals(
      expected = 5,
      actual = solution.removeDuplicates(nums)
    )

    intArrayOf(0, 1, 2, 3, 4).forEachIndexed { i, num ->
      assertEquals(nums[i], num)
    }
  }
}