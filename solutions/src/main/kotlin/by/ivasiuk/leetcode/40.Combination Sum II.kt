package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/combination-sum-ii/">
 *   Combination Sum II</a>
 */
class CombinationSum2 {
  fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    val availability = candidates.toList().groupingBy { it }.eachCount().toMutableMap()

    trySum(candidates.filter { it <= target }.toSet(), availability, 0, Stack<Int>(), target, result)

    return result.toList()
  }

  private fun trySum(
    candidates: Set<Int>,
    availability: MutableMap<Int, Int>,
    currentSum: Int,
    currentNums: Stack<Int>,
    target: Int,
    result: MutableSet<List<Int>>
  ) {
    for (num in candidates) {
      if (availability[num]!! > 0) {
        if (currentSum + num == target) {
          result.add((currentNums.toList() + num).sorted())
        } else if (currentSum + num < target) {
          currentNums.push(num)
          availability[num] = availability[num]!! - 1
          trySum(candidates, availability, currentSum + num, currentNums, target, result)
          availability[num] = availability[num]!! + 1
          currentNums.pop()
        }
      }
    }
  }
}