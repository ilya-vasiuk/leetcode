package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/">
 *   Number of Students Unable to Eat Lunch</a>
 */
class NumberOfStudentsUnableToEatLunch {
  fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    val studentsQueue = LinkedList<Int>().apply { students.forEach { offer(it) } }
    val sandwichesQueue = LinkedList<Int>().apply { sandwiches.forEach { offer(it) } }

    while (studentsQueue.isNotEmpty() && studentsQueue.contains(sandwichesQueue.peek())) {
      if (studentsQueue.peek() == sandwichesQueue.peek()) {
        studentsQueue.pop()
        sandwichesQueue.pop()
      } else {
        studentsQueue.offer(studentsQueue.pop())
      }
    }

    return studentsQueue.size
  }
}
