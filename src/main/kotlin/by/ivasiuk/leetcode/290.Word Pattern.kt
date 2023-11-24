package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/word-pattern/">Word Pattern</a>
 */
class WordPattern {
  fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(" ")
    if (words.size != pattern.length) {
      return false
    }

    val wordMapping = mutableMapOf<String, Char>()
    val charMapping = mutableMapOf<Char, String>()

    for (i in words.indices) {
      val char = wordMapping[words[i]]
      val word = charMapping[pattern[i]]

      if (char == null && word == null) {
        charMapping[pattern[i]] = words[i]
        wordMapping[words[i]] = pattern[i]
      } else if (char != null && word != null) {
        if (charMapping[char] != word || wordMapping[word] != char) {
          return false
        }
      } else {
        return false
      }
    }

    return true
  }
}
