package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/">
 *   Maximum Length of a Concatenated String with Unique Characters</a>
 */
class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
  fun maxLength(arr: List<String>): Int = combine("", arr, 0)

  private fun combine(current: String, arr: List<String>, i: Int): Int =
    if (i < arr.size) {
      var max = maxOf(0, combine(current, arr, i + 1))

      if (arr[i].toCharArray().toSet().size == arr[i].length) {
        max = maxOf(max, combine(arr[i], arr, i + 1))

        if (current.none { arr[i].contains(it) }) {
          max = maxOf(max, combine(current + arr[i], arr, i + 1))
        }
      }

      max
    } else {
      current.length
    }
}