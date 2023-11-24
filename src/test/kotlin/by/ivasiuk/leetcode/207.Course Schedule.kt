package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CourseScheduleTest {
  private val solution = CourseSchedule()

  @Test
  fun example1() {
    assertTrue {
      solution.canFinish(
        numCourses = 2,
        prerequisites = arrayOf(
          intArrayOf(1, 0)
        )
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canFinish(
        numCourses = 2,
        prerequisites = arrayOf(
          intArrayOf(1, 0),
          intArrayOf(0, 1),
        )
      )
    }
  }
}
