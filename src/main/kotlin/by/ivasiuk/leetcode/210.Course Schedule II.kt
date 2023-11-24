package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/course-schedule-ii/">
 *   Course Schedule II</a>
 */
//TODO:Solution from leetcode. Read more about Kahn's algorithm and retry
class CourseSchedule2 {
  fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
    val adjList = mutableMapOf<Int, MutableList<Int>>()
    val indegree = IntArray(numCourses)
    val topologicalOrder = IntArray(numCourses)

    for (i in prerequisites.indices) {
      val dest = prerequisites[i][0]
      val src = prerequisites[i][1]
      adjList.getOrPut(src) { mutableListOf() } .add(dest)
      indegree[dest] += 1
    }

    val q: Queue<Int> = LinkedList()
    for (i in 0 until numCourses) {
      if (indegree[i] == 0) {
        q.add(i)
      }
    }

    var i = 0
    while (q.isNotEmpty()) {
      val node: Int = q.remove()
      topologicalOrder[i++] = node

      if (adjList.containsKey(node)) {
        for (neighbor in adjList[node]!!) {
          indegree[neighbor]--

          if (indegree[neighbor] == 0) {
            q.add(neighbor)
          }
        }
      }
    }

    return if (i == numCourses) {
      topologicalOrder
    } else {
      IntArray(0)
    }
  }
}
