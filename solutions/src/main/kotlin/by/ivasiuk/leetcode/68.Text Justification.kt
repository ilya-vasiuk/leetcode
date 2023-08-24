package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/text-justification/">Text Justification</a>
 */
class TextJustification {
  fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
    val result = ArrayList<String>()
    val buffer = StringBuilder(maxWidth)

    var i = 0
    while (i < words.size) {
      var lenLeft = maxWidth
      var end = i
      var wordsLen = 0

      while (lenLeft > 0 && end < words.size && words[end].length <= lenLeft) {
        val wordLen = words[end++].length

        wordsLen += wordLen
        lenLeft -= wordLen + 1
      }

      val wordsPerLine = end - i
      val spaces = maxWidth - wordsLen

      if (wordsPerLine == 1) {
        buffer.addWordWithSpaces(words[i++], spaces)
      } else if (end == words.size) {
        repeat(wordsPerLine - 1) {
          buffer.addWordWithSpaces(words[i++], 1)
        }

        buffer.addWordWithSpaces(words[i], maxWidth - buffer.length - words[i++].length)
      } else {
        val wordsWithSpace = wordsPerLine - 1
        val space = spaces / wordsWithSpace
        var extra = spaces % wordsWithSpace

        repeat(wordsWithSpace) {
          val add = if (extra-- > 0) 1 else 0
          buffer.addWordWithSpaces(words[i++], space + add)
        }

        buffer.append(words[i++])
      }

      result.add(buffer.toString())
      buffer.clear()
    }

    return result
  }

  private fun StringBuilder.addWordWithSpaces(word: String, spaces: Int) {
    this.append(word)

    if (spaces > 0) {
      this.append(" ".repeat(spaces))
    }
  }
}
