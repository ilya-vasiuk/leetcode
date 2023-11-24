package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-string-chain/">Longest String Chain</a>
 */
class LongestStringChain {
  fun longestStrChain(words: Array<String>): Int {
    val wordsByLength = words.groupBy { it.length }
    val visited = mutableSetOf<String>()
    words.sortBy { it.length }

    fun visit(current: String, chain: Int = 1): Int {
      var max = chain
      visited.add(current)
      wordsByLength[current.length + 1]?.forEach { word ->
        for (i in word.indices) {
          if (!visited.contains(word) && word.substring(0, i) + word.substring(i + 1, word.length) == current) {
            max = maxOf(max, visit(word, chain + 1))
          }
        }
      }

      return max
    }

    var max = 1

    for (word in words) {
      if (!visited.contains(word)) {
        max = maxOf(max, visit(word))
      }
    }

    return max
  }
}
