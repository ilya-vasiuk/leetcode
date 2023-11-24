package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">
 *   Generate Parentheses</a>
 */
class GenerateParentheses {
  fun generateParenthesis(n: Int): List<String> {
    val result = mutableListOf<String>()

    generate("", n, 0, 0, result)

    return result
  }

  private fun generate(
    currentSequence: String,
    target: Int,
    open: Int,
    closed: Int,
    result: MutableList<String>
  ) {
    if (currentSequence.length == target * 2) {
      result.add(currentSequence)
    } else {
      if (open < target) {
        generate("$currentSequence(", target, open + 1, closed, result)
      }
      if (closed < open && closed < target) {
        generate("$currentSequence)", target, open, closed + 1, result)
      }
    }
  }
}