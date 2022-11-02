package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">
 *   Implement Trie (Prefix Tree)</a>
 */
class Trie {
  val root = TrieNode()

  fun insert(word: String) {
    var cur = root

    for (char in word) {
      cur = cur.map.getOrPut(char) { TrieNode() }!!
    }

    cur.end = true
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

    return cur.end
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
    var end: Boolean = false,
  )
}