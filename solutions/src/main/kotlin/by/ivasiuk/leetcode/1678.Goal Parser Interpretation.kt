package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/goal-parser-interpretation/">
 *   Goal Parser Interpretation</a>
 */
class GoalParserInterpretation {
  fun interpret(command: String): String {
    val result = mutableListOf<String>()
    var i = 0

    while (i < command.length) {
      when (command[i]) {
        'G' -> result.add("G")
        '(' -> {
          if (command[i + 1] == ')') {
            result.add("o")
            i++
          } else {
            result.add("al")
            i += 3
          }
        }
      }

      i++
    }

    return result.joinToString("")
  }
}
