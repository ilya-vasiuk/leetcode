package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-all-people-with-secret/">
 *   Find All People With Secret</a>
 */
class FindAllPeopleWithSecret {
  fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
    meetings.sortWith(compareBy { it[2] })
    val uf = HashMap<Int, Int>()

    fun root(a: Int): Int =
      uf[a]?.let { if (a == it) a else root(it).also { uf[a] = it } } ?: a

    uf[0] = firstPerson

    val s = mutableListOf<Int>()
    var prev = 0

    for ((a, b, t) in meetings) {
      if (t > prev) {
        for (x in s) {
          if (root(x) != root(0)) {
            uf[x] = x
          }
        }
      }

      if (t > prev) {
        s.clear()
      }

      uf[root(a)] = root(b)

      s += a
      s += b
      prev = t
    }
    return (0 until n).filter { root(0) == root(it) }
  }
}
