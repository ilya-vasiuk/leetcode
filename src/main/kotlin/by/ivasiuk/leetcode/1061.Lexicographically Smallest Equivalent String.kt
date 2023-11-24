package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-equivalent-string/">
 *   Lexicographically Smallest Equivalent String</a>
 */
class LexicographicallySmallestEquivalentString {
  fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
    val pairs = IntArray(26) { it }
    for (i in s1.indices) {
      val pa = find(s1[i] - 'a', pairs)
      val pb = find(s2[i] - 'a', pairs)

      if (pa < pb) {
        pairs[pb] = pa
      } else {
        pairs[pa] = pb
      }
    }
    return baseStr.toCharArray().map {
      ('a' + find(it - 'a', pairs))
    }.joinToString("")
  }

  private fun find(x: Int, pairs: IntArray): Int {
    if (pairs[x] != x) {
      pairs[x] = find(pairs[x], pairs)
    }
    return pairs[x]
  }
}
