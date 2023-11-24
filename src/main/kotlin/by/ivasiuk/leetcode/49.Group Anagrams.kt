package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/group-anagrams/">
 *   Group Anagrams</a>
 */
class GroupAnagrams {
  fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val groups = mutableMapOf<String, MutableList<String>>()
    for (str in strs) {
      val key = str.toCharArray().sorted().joinToString("")
      groups.getOrPut(key) { mutableListOf() }.add(str)
    }

    return groups.values.toList()
  }
}