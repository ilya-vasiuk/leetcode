package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class JumpGame4Test {
  private val solution = JumpGame4()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minJumps(
        arr = intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minJumps(
        arr = intArrayOf(7)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.minJumps(
        arr = intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)
      )
    )
  }
}
