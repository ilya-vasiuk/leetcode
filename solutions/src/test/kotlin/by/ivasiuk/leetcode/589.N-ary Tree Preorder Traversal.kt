package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.NaryTreePreorderTraversal.Node
import kotlin.test.Test
import kotlin.test.assertContentEquals

class NaryTreePreorderTraversalTest {
  private val solution = NaryTreePreorderTraversal()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 3, 5, 6, 2, 4),
      actual = solution.preorder(
        root = Node(1).also {
          it.children = listOf(
            Node(3).also {
              it.children = listOf(
                Node(5),
                Node(6),
              )
            },
            Node(2),
            Node(4)
          )
        }
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10),
      actual = solution.preorder(
        root = Node(1).also {
          it.children = listOf(
            Node(2),
            Node(3).also {
              it.children = listOf(
                Node(6),
                Node(7).also {
                  it.children = listOf(
                    Node(11).also {
                      it.children = listOf(
                        Node(14),
                      )
                    }
                  )
                },
              )
            },
            Node(4).also {
              it.children = listOf(
                Node(8).also {
                  it.children = listOf(
                    Node(12),
                  )
                },
              )
            },
            Node(5).also {
              it.children = listOf(
                Node(9).also {
                  it.children = listOf(
                    Node(13),
                  )
                },
                Node(10),
              )
            },
          )
        }
      )
    )
  }
}