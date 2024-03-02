package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">
 *   Squares of a Sorted Array</a>
 */
class SquaresOfASortedArray {
  fun sortedSquares(nums: IntArray): IntArray =
    nums.map { it * it }.sorted().toIntArray()
}
