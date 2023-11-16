package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-unique-binary-string/">Find Unique Binary String</a>
 */
class FindUniqueBinaryString {
  fun findDifferentBinaryString(nums: Array<String>): String =
    nums.indices.map { i -> (nums[i][i].code xor 1).toChar() }.joinToString("")
}
