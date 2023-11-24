package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindInMountainArrayTest {
  private val solution = FindInMountainArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findInMountainArray(
        target = 3,
        mountainArr = MountArrayImpl(intArrayOf(1, 2, 3, 4, 5, 3, 1))
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.findInMountainArray(
        target = 3,
        mountainArr = MountArrayImpl(intArrayOf(0, 1, 2, 4, 2, 1))
      )
    )
  }

  class MountArrayImpl(private val array: IntArray) : FindInMountainArray.MountainArray {
    override fun get(index: Int): Int = array[index]

    override fun length(): Int = array.size
  }
}
