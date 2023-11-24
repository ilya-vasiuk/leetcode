package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/">
 *   Find Smallest Letter Greater Than Target</a>
 */
class FindSmallestLetterGreaterThanTarget {
  fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    var left = 0
    var right = letters.lastIndex

    while (left <= right) {
      val mid = (left + right) / 2

      if (letters[mid] > target) {
        right = mid - 1
      } else {
        left = mid + 1
      }
    }

    return if (left in letters.indices && letters[left] > target) {
      letters[left]
    } else {
      letters[0]
    }
  }
}
