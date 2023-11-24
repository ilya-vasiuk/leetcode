package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class FindTheOriginalArrayOfPrefixXor {
  fun findArray(pref: IntArray): IntArray {
    var last = pref[0]

    for (i in 1 until pref.size) {
      pref[i] = pref[i] xor last
      last = pref[i] xor last
    }

    return pref
  }
}
