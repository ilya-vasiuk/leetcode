package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateBinaryTreeNodesTest {
  private val solution = ValidateBinaryTreeNodes()

  @Test
  fun example1() {
    assertTrue {
      solution.validateBinaryTreeNodes(
        n = 4,
        leftChild = intArrayOf(1, -1, 3, -1),
        rightChild = intArrayOf(2, -1, -1, -1),
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.validateBinaryTreeNodes(
        n = 4,
        leftChild = intArrayOf(1, -1, 3, -1),
        rightChild = intArrayOf(2, 3, -1, -1),
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.validateBinaryTreeNodes(
        n = 2,
        leftChild = intArrayOf(1, 0),
        rightChild = intArrayOf(-1, 1),
      )
    }
  }
}
