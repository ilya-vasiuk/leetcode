package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/best-team-with-no-conflicts/">
 *   Best Team With No Conflicts</a>
 */
class BestTeamWithNoConflicts {
  fun bestTeamScore(scores: IntArray, ages: IntArray): Int {
    val players = Array(scores.size) { i -> Pair(ages[i], scores[i]) }
      .sortedWith(compareBy({ it.first }, { it.second }))
    val teamScore = IntArray(players.size) { i -> players[i].second }
    var result = 0

    for (i in players.indices) {
      for (j in 0 until i) {
        if (players[j].second <= players[i].second) {
          teamScore[i] = maxOf(teamScore[i], teamScore[j] + players[i].second)
        }
      }

      result = maxOf(result, teamScore[i])
    }

    return result
  }
}
