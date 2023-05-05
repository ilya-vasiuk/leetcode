package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Maximum Number of Vowels in a Substring of Given Length</a>
 */
class MaximumNumberOfVowelsInASubstringOfGivenLength {
  fun maxVowels(s: String, k: Int): Int {
    var curr = 0

    for(i in 0 until k) {
      curr += s[i].isVowel()
    }

    var max = curr
    for(i in k until s.length) {
      curr = curr - s[i - k].isVowel() + s[i].isVowel()
      max = maxOf(max, curr)
    }

    return max
  }

  private fun Char.isVowel() = when(this) {
    'a', 'e', 'u', 'i', 'o' -> 1
    else -> 0
  }
}
