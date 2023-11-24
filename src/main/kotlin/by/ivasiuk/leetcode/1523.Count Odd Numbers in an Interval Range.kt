package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/">
 *   Count Odd Numbers in an Interval Range</a>
 */
class CountOddNumbersInAnIntervalRange {
  fun countOdds(low: Int, high: Int): Int =
    (high + 1) / 2 - low / 2
}
