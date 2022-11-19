package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/">
 *    Sum of All Odd Length Subarrays</a>
 */
class SumOfAllOddLengthSubarrays {
  fun sumOddLengthSubarrays(arr: IntArray): Int =
    arr.indices.fold(0) { acc, i ->
      acc + ((i + 1) * (arr.size - i) + 1) / 2 * arr[i]
    }
}