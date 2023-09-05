package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import by.ivasiuk.leetcode.CopyListWithRandomPointer.Node

class CopyListWithRandomPointerTest {
  private val solution = CopyListWithRandomPointer()

  @Test
  fun example1() {
    val node7 = Node(7)
    val node13 = Node(13)
    val node11 = Node(11)
    val node10 = Node(10)
    val node1 = Node(1)

    assertContentEquals(
      expected = listOf(
        7 to null,
        13 to 7,
        11 to 1,
        10 to 11,
        1 to 7
      ),
      actual = solution.copyRandomList(
        node = node7.apply {
          next = node13.apply {
            random = node7
            next = node11.apply {
              random = node1
              next = node10.apply {
                random = node11
                next = node1.apply {
                  random = node7
                }
              }
            }
          }
        }
      ).toList()
    )
  }

  @Test
  fun example2() {
    val node1 = Node(1)
    val node2 = Node(2)

    assertContentEquals(
      expected = listOf(
        1 to 2,
        2 to 2,
      ),
      actual = solution.copyRandomList(
        node = node1.apply {
          random = node2
          next = node2.apply {
            random = node2
          }
        }
      ).toList()
    )
  }

  @Test
  fun example3() {
    val node1 = Node(3)
    val node2 = Node(3)
    val node3 = Node(3)

    assertContentEquals(
      expected = listOf(
        3 to null,
        3 to 3,
        3 to null,
      ),
      actual = solution.copyRandomList(
        node = node1.apply {
          next = node2.apply {
            random = node1
            next = node3
          }
        }
      ).toList()
    )
  }

  fun Node?.toList(): List<Pair<Int, Int?>> {
    val result = mutableListOf<Pair<Int, Int?>>()
    var current: Node? = this

    while (current != null) {
      result.add(current.`val` to current.random?.`val`)
      current = current.next
    }

    return result
  }
}
