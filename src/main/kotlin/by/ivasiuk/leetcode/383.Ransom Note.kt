package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/ransom-note/">
 *   Ransom Note</a>
 */
class RansomNote {
  fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val count = IntArray(26) { 0 }

    for (i in magazine.indices) {
      count[magazine[i].minus('a')]++
    }

    for (i in ransomNote.indices) {
      if (count[ransomNote[i].minus('a')]-- == 0) {
        return false
      }
    }

    return true
  }
}