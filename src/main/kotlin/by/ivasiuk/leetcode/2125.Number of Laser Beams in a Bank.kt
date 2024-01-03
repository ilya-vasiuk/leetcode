package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Number of Laser Beams in a Bank</a>
 */
class NumberOfLaserBeamsInABank {
  fun numberOfBeams(bank: Array<String>): Int {
    var prev = 0
    var result = 0

    for (row in bank) {
      val current = row.count { it == '1' }

      if (current != 0) {
        if (prev != 0) {
          result += current * prev
        }

        prev = current
      }
    }

    return result
  }
}
