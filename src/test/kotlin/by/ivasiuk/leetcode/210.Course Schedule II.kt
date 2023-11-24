package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CourseSchedule2Test {
  private val solution = CourseSchedule2()

  @Test
  fun example1() {
    val result = solution.findOrder(
      numCourses = 2,
      prerequisites = arrayOf(intArrayOf(1, 0))
    )

    assertContentEquals(intArrayOf(0, 1), result)
  }

  @Test
  fun example2() {
    val result = solution.findOrder(
      numCourses = 4,
      prerequisites = arrayOf(
        intArrayOf(1, 0),
        intArrayOf(2, 0),
        intArrayOf(3, 1),
        intArrayOf(3, 2),
      )
    )

    assertContentEquals(intArrayOf(0, 1, 2, 3), result)
  }
}
