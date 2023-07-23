package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertTrue

class AllPossibleFullBinaryTreesTest {
  private val solution = AllPossibleFullBinaryTrees()
  private val validator = SameTree()

  @Test
  fun example1() {
    val expected = listOf(
      TreeNode(0).apply {
        left = TreeNode(0)
        right = TreeNode(0).apply {
          left = TreeNode(0)
          right = TreeNode(0).apply {
            left = TreeNode(0)
            right = TreeNode(0)
          }
        }
      },
      TreeNode(0).apply {
        left = TreeNode(0)
        right = TreeNode(0).apply {
          left = TreeNode(0).apply {
            left = TreeNode(0)
            right = TreeNode(0)
          }
          right = TreeNode(0)
        }
      },
      TreeNode(0).apply {
        left = TreeNode(0).apply {
          left = TreeNode(0)
          right = TreeNode(0)
        }
        right = TreeNode(0).apply {
          left = TreeNode(0)
          right = TreeNode(0)
        }
      },
      TreeNode(0).apply {
        left = TreeNode(0).apply {
          left = TreeNode(0)
          right = TreeNode(0).apply {
            left = TreeNode(0)
            right = TreeNode(0)
          }
        }
        right = TreeNode(0)
      },
      TreeNode(0).apply {
        left = TreeNode(0).apply {
          left = TreeNode(0).apply {
            left = TreeNode(0)
            right = TreeNode(0)
          }
          right = TreeNode(0)
        }
        right = TreeNode(0)
      },
    )

    val actual = solution.allPossibleFBT(7)
    for (i in expected.indices) {
      assertTrue { validator.isSameTree(expected[i], actual[i]) }
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      TreeNode(0).apply {
        left = TreeNode(0)
        right = TreeNode(0)
      }
    )

    val actual = solution.allPossibleFBT(3)
    for (i in expected.indices) {
      assertTrue { validator.isSameTree(expected[i], actual[i]) }
    }
  }
}
