package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-duplicate-number/">
 *   Find the Duplicate Number</a>
 */
class FindTheDuplicateNumber {
  fun findDuplicate(nums: IntArray): Int {
    var slow = nums[0]
    var fast = nums[0]

    do {
      slow = nums[slow]
      fast = nums[nums[fast]]
    } while (slow != fast)

    fast = nums[0]
    while (slow != fast) {
      slow = nums[slow]
      fast = nums[fast]
    }

    return slow
  }
}
