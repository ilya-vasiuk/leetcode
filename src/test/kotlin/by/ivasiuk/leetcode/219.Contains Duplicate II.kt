package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicate2Test {
  private val solution = ContainsDuplicate2()

  @Test
  fun example1() {
    assertTrue {
      solution.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3)
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1)
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2)
    }
  }

  @Test
  fun example4() {
    assertTrue {
      solution.containsNearbyDuplicate(intArrayOf(99, 99), 2)
    }
  }
}