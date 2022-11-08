package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/word-break/">Word Break</a>
 */
//TODO: trie optimization
class WordBreak {
  fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val n = s.length
    val visited = BooleanArray(n)

    return check(s, n, 0, wordDict.toSet(), visited)
  }

  private fun check(s: String, n:Int, i: Int, words: Set<String>, visited: BooleanArray): Boolean {
    if (i == n) {
      return true
    }

    if(visited[i]) {
      return false
    }

    visited[i] = true

    for (j in i + 1..n) {
      if(words.contains(s.substring(i, j)) && check(s, n, j, words, visited)) {
        return true
      }
    }

    return false
  }
}
