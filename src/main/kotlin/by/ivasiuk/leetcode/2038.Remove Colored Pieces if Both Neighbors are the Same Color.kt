package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/">
 *   Remove Colored Pieces if Both Neighbors are the Same Color</a>
 */
class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
  fun winnerOfGame(colors: String): Boolean {
    var aCount = 0
    var bCount = 0

    for (i in 1 until colors.lastIndex) {
      if ((colors[i - 1] == colors[i]) && (colors[i] == colors[i + 1])) {
        if (colors[i] == 'A') aCount++ else bCount++
      }
    }

    return aCount > bCount
  }
}
