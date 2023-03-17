package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">
 *   Implement Trie (Prefix Tree)</a>
 */
class Trie {
  private val root = TrieNode()

  fun insert(word: String) {
    var curr = root

    word.forEach { char ->
      curr = curr.children[char - 'a'] ?: TrieNode()
        .also { curr.children[char - 'a'] = it }
    }

    curr.isWord = true
  }

  fun search(word: String): Boolean {
    var curr = root

    word.forEach { char ->
      curr = curr.children[char - 'a'] ?: return false
    }

    return curr.isWord
  }

  fun startsWith(prefix: String): Boolean {
    var curr = root

    prefix.forEach { char ->
      curr = curr.children[char - 'a'] ?: return false
    }

    return true
  }
}

data class TrieNode(
  var isWord: Boolean = false,
  val children: Array<TrieNode?> = arrayOfNulls(26)
)