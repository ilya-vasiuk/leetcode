package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/word-break/">Word Break</a>
 */
class WordBreak {
  fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val cache = mutableMapOf<Int, Boolean>()

    fun dfs(i: Int): Boolean = cache.getOrPut(i) {
      i >= s.length || wordDict
        .filter { word -> i + word.lastIndex in s.indices && s.substring(i, i + word.length) == word }
        .any { word -> dfs(i + word.length) }
    }

    return dfs(0)
  }
}
