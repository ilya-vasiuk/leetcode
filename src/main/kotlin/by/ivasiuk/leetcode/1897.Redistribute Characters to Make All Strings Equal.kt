package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Redistribute Characters to Make All Strings Equal</a>
 */
class RedistributeCharactersToMakeAllStringsEqual {
  fun makeEqual(words: Array<String>): Boolean =
    IntArray(26).also {
      for (word in words) {
        for (c in word) {
          it[c - 'a']++
        }
      }
    }.all { it % words.size == 0 }
}
