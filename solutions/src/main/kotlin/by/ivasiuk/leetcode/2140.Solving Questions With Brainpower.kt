package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/solving-questions-with-brainpower/">
 *   Solving Questions With Brainpower</a>
 */
class SolvingQuestionsWithBrainpower {
  fun mostPoints(questions: Array<IntArray>): Long {
    val n = questions.size
    val max = LongArray(n).also {
      it[n - 1]= questions.last().first().toLong()
    }

    for (i in n - 2 downTo 0) {
      val next = i + questions[i].last() + 1

      max[i] = maxOf(max[i + 1], questions[i].first() + if (next < n) max[next] else 0)
    }

    return max.first()
  }
}
