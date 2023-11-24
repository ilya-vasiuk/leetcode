package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/">
 *   Reduction Operations to Make the Array Elements Equal</a>
 */
class ReductionOperationsToMakeTheArrayElementsEqual {
  fun reductionOperations(nums: IntArray): Int {
    return nums.toList()
      .groupingBy { it }
      .eachCount()
      .toList()
      .sortedBy { it.first }
      .map { it.second }
      .foldIndexed(0) { i, acc, freq -> acc + freq * i }
  }
}
