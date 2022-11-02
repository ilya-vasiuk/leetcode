package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TrieTest {
  @Test
  fun example1() {
    val trie = Trie()
    trie.insert("apple")
    
    assertTrue(trie.search("apple"))
    assertFalse(trie.search("app"))
    assertTrue(trie.startsWith("app"))

    trie.insert("app")

    assertTrue(trie.search("app"))
  }
}
