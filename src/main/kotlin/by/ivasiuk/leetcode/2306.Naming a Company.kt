package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/naming-a-company/">
 *   Naming a Company</a>
 */
class NamingACompany {
  fun distinctNames(ideas: Array<String>): Long {
    val sets = Array(26) { mutableSetOf<String>() }
    val same = Array(26) { IntArray(26) }
    var res = 0L

    for (s in ideas) {
      sets[s[0] - 'a'].add(s.substring(1))
    }

    for (i in 0..25) {
      for (s in sets[i]) {
        for (j in i + 1..25) {
          if (sets[j].contains(s)) {
            same[i][j]++
          }
        }
      }
    }

    for (i in 0..25) {
      for (j in i + 1..25) {
        res += (sets[i].size - same[i][j]) * (sets[j].size - same[i][j]) * 2
      }
    }

    return res
  }
}
