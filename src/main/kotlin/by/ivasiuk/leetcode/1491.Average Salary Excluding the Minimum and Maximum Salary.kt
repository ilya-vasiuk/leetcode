package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">
 *   Average Salary Excluding the Minimum and Maximum Salary</a>
 */
class AverageSalaryExcludingTheMinimumAndMaximumSalary {
  fun average(salary: IntArray): Double {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var sum = 0

    for (i in salary) {
      if (i < min) min = i
      if (i > max) max = i
      sum += i
    }

    return (sum - min - max).div(salary.size - 2.0)
  }
}