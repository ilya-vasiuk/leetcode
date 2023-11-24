package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-length-of-pair-chain/">
 *   Maximum Length of Pair Chain</a>
 */
class MaximumLengthOfPairChain {
  fun findLongestChain(pairs: Array<IntArray>): Int = pairs
    .sortedBy{ it[1] }
    .fold(Pair(0, -1111)) { acc, (start, end) ->
      if(start > acc.second) Pair(acc.first + 1, end) else acc
    }
    .first
}
