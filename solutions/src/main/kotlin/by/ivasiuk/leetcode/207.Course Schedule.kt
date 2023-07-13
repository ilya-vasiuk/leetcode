package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/course-schedule/">Course Schedule</a>
 */
class CourseSchedule {
  fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    val visited = mutableSetOf<Int>()
    val graph = Array(numCourses) { mutableListOf<Int>() }.also {
      prerequisites.forEach { (a, b) -> it[a].add(b) }
    }

    fun check(course: Int): Boolean {
      if (visited.contains(course)) {
        return false
      }

      visited.add(course)

      for (prerequisite in graph[course]) {
        if (!check(prerequisite)) {
          return false
        }
      }

      visited.remove(course)
      graph[course].clear()

      return true
    }

    prerequisites.forEach { edge ->
      if (!check(edge[0])) {
        return false
      }

      visited.clear()
    }

    return true
  }
}
