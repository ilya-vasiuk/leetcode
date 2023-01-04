package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/">
 *   Minimum Rounds to Complete All Tasks</a>
 */
class MinimumRoundsToCompleteAllTasks {
  fun minimumRounds(tasks: IntArray): Int {
    val frequency = tasks.asList().groupingBy { it }.eachCount()

    var rounds = 0
    for (count in frequency.values) {
      if (count == 1) {
        return -1
      }

      rounds += count / 3 + if (count % 3 == 0) 0 else 1
    }

    return rounds
  }
}
