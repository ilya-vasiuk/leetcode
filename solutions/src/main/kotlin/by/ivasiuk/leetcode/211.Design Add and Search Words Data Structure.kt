package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/">
 *   Design Add and Search Words Data Structure</a>
 */
class WordDictionary {
  private val root = TrieNode()

  fun addWord(word: String) {
    var curr = root

    word.forEach { char ->
      curr = curr.children[char - 'a'] ?: TrieNode()
        .also { curr.children[char - 'a'] = it }
    }

    curr.isWord = true
  }

  fun search(word: String): Boolean {
    return search(root, word)
  }

  private fun search(node: TrieNode, word: String): Boolean {
    if (word.isEmpty()) {
      return node.isWord
    }

    val next = word.substring(1)

    return if (word[0] == '.') {
      node.children.filterNotNull().any { search(it, next) }
    } else {
      node.children[word[0] - 'a']?.let { search(it, next) } ?: false
    }
  }

  data class TrieNode(
    var isWord: Boolean = false,
    val children: Array<TrieNode?> = arrayOfNulls(26)
  )
}
