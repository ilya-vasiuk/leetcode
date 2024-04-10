package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/reveal-cards-in-increasing-order/">
 *   Reveal Cards In Increasing Order</a>
 */
class RevealCardsInIncreasingOrder {
  fun deckRevealedIncreasing(deck: IntArray): IntArray {
    val result = LinkedList<Int>()
    deck.sortDescending()

    for (card in deck) {
      if (result.isNotEmpty()) {
        result.addFirst(result.pollLast())
      }

      result.addFirst(card)
    }

    return result.toIntArray()
  }
}
