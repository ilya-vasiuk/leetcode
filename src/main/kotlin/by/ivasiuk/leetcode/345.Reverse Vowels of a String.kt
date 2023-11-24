package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/">
 *   Reverse Vowels of a String</a>
 */
class ReverseVowelsOfAString {
  fun reverseVowels(s: String): String {
    val str = s.toCharArray()
    var i = 0
    var j = s.length - 1
    val vowels = setOf('a', 'o', 'i', 'u', 'e', 'A', 'O', 'I', 'U', 'E')

    while (i < j) {
      while (!vowels.contains(s[i]) && i < j) {
        i++
      }

      while (!vowels.contains(s[j]) && i < j) {
        j--
      }

      if (i < j && s[i] != s[j]) {
        val tmp = s[i]
        str[i] = s[j]
        str[j] = tmp
      }

      i++
      j--
    }

    return str.joinToString("")
  }
}