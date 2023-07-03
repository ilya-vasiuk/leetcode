package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/buddy-strings/">Buddy Strings</a>
 */
class BuddyStrings {
  fun buddyStrings(s: String, goal: String): Boolean {
    if (s.length != goal.length) {
      return false
    }

    val diff = mutableListOf<Pair<Char, Char>>()

    for (i in s.indices) {
      if (s[i] != goal[i]) {
        if (diff.size == 2) {
          return false
        }

        diff.add(Pair(s[i], goal[i]))
      }
    }

    return when (diff.size) {
      0 -> s.length != s.toSet().size
      2 -> diff[0].first == diff[1].second && diff[0].second == diff[1].first
      else -> false
    }
  }
}
