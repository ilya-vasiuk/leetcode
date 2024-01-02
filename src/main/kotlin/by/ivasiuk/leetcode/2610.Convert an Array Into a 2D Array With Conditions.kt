package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/">
 *   Convert an Array Into a 2D Array With Conditions</a>
 */
class ConvertAnArrayIntoA2DArrayWithConditions {
  fun findMatrix(nums: IntArray): List<List<Int>> {
    val freq = nums.asIterable().groupingBy { it }.eachCount()
    val minRows = freq.values.max()
    val result = List(minRows) { mutableListOf<Int>() }

    for ((num, count) in freq) {
      for (index in 0..<count) {
        result[index].add(num)
      }
    }

    return result
  }
}
