package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/combination-sum/">
 *   Combination Sum</a>
 */
class CombinationSum {
  fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    trySum(candidates.sorted(), 0, 0, Stack<Int>(), target, result)

    return result
  }

  private fun trySum(
    candidates: List<Int>,
    currentIdx: Int,
    currentSum: Int,
    currentNums: Stack<Int>,
    target: Int,
    result: MutableList<List<Int>>
  ) {
    for (i in currentIdx until candidates.size) {
      val num = candidates[i]
      if (currentSum + num == target) {
        result.add(currentNums.toList() + num)
      } else if (currentSum + num < target) {
        currentNums.push(num)
        trySum(candidates, i, currentSum + num, currentNums, target, result)
        currentNums.pop()
      } else {
        break
      }
    }
  }
}