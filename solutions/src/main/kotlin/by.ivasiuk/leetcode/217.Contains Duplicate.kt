package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">
 *   Contains Duplicate</a>
 */
class ContainsDuplicate {
  fun containsDuplicate(nums: IntArray): Boolean = nums.size != nums.toSet().size
}