package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TaskSchedulerTest {
  private val solution = TaskScheduler()

  @Test
  fun example1() {
    val result = solution.leastInterval(charArrayOf('A','A','A','B','B','B'), 2)

    assertEquals(8, result)
  }

  @Test
  fun example2() {
    val result = solution.leastInterval(charArrayOf('A','A','A','B','B','B'), 0)

    assertEquals(6, result)
  }

  @Test
  fun example3() {
    val result = solution.leastInterval(charArrayOf('A','A','A','A','A','A','B','C','D','E','F','G'), 2)

    assertEquals(16, result)
  }
}