package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/word-search-ii/">Word Search II</a>
 */
class WordSearch2 {
  fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
    val trie = Trie()
    words.forEach { trie.insert(it) }

    val m = board.size
    val n = board[0].size
    val visited = Array(m) { BooleanArray(n) }
    val result = mutableSetOf<String>()

    for (i in 0 until m) {
      for (j in 0 until n) {
        if (trie.startsWith(board[i][j].toString())) {
          check(board, m, n, i, j, trie.root, visited, result)
        }
      }
    }

    return result.toList()
  }

  private fun check(
    board: Array<CharArray>,
    m: Int,
    n: Int,
    i: Int,
    j: Int,
    node: Trie.TrieNode,
    visited: Array<BooleanArray>,
    result: MutableSet<String>
  ) {
    if (
      i in 0 until m &&
      j in 0 until n &&
      !visited[i][j]
    ) {
      val char = board[i][j]
      if (node.map.containsKey(char)) {
        node.map[char]?.word?.let {
          result.add(it)
        }

        visited[i][j] = true

        check(board, m, n, i - 1, j, node.map[char]!!, visited, result)
        check(board, m, n, i, j + 1, node.map[char]!!, visited, result)
        check(board, m, n, i + 1, j, node.map[char]!!, visited, result)
        check(board, m, n, i, j - 1, node.map[char]!!, visited, result)

        visited[i][j] = false
      }
    }
  }

  class Trie {
    val root = TrieNode()

    fun insert(word: String) {
      var cur = root

      for (char in word) {
        cur = cur.map.getOrPut(char) { TrieNode() }!!
      }

      cur.word = word
    }

    fun search(word: String): Boolean {
      var cur = root

      for (char in word) {
        if (cur.map.contains(char)) {
          cur = cur.map[char]!!
        } else {
          return false
        }
      }

      return cur.word != null
    }

    fun startsWith(prefix: String): Boolean {
      var cur = root

      for (char in prefix) {
        if (cur.map.contains(char)) {
          cur = cur.map[char]!!
        } else {
          return false
        }
      }

      return true
    }

    data class TrieNode(
      val map: MutableMap<Char, TrieNode?> = mutableMapOf(),
      var word: String? = null,
    )
  }
}
