package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class MinimumOneBitOperationsToMakeIntegersZero {
  fun minimumOneBitOperations(n: Int): Int =
    if (n != 0) {
      n.takeHighestOneBit() * 2 - minimumOneBitOperations(n - n.takeHighestOneBit()) - 1
    } else 0
}
