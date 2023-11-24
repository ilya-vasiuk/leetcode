package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/">
 *   Longest Palindrome by Concatenating Two Letter Words</a>
 */
class LongestPalindromeByConcatenatingTwoLetterWords {
  fun longestPalindrome(words: Array<String>): Int {
    val notPaired = mutableMapOf<String, Int>()
    var length = 0
    var symmetricCount = 0

    for (word in words) {
      if (!notPaired.containsKey(word)) {
        notPaired[word] = 0
      }

      if (word[0] != word[1]) {
        val reversed = word.reversed()
        val count = notPaired.getOrDefault(reversed, 0)

        if (count > 0) {
          length += 4
          notPaired[reversed] = count - 1
        } else {
          notPaired[word] = notPaired.getOrDefault(word, 0) + 1
        }
      } else {
        val count = notPaired.getOrDefault(word, 0)
        if (count > 0) {
          notPaired[word] = count - 1
          length += 4
          symmetricCount--
        } else {
          notPaired[word] = count + 1
          symmetricCount++
        }
      }
    }

    return  length + if (symmetricCount > 0) 2 else 0
  }
}