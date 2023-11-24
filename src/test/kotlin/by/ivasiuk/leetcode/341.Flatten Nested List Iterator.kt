package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NestedIteratorTest {
  @Test
  fun example1() {
    val nestedList = listOf(
      NestedIntegerImpl(
        listOf(
          NestedIntegerImpl(1),
          NestedIntegerImpl(1)
        )
      ),
      NestedIntegerImpl(2),
      NestedIntegerImpl(
        listOf(
          NestedIntegerImpl(1),
          NestedIntegerImpl(1)
        )
      ),
    )

    val iterator = NestedIterator(nestedList)
    val actual = mutableListOf<Int>()
    while (iterator.hasNext()) {
      actual.add(iterator.next())
    }

    assertContentEquals(
      expected = listOf(1, 1, 2, 1, 1),
      actual = actual
    )
  }

  @Test
  fun example2() {
    val nestedList = listOf(
      NestedIntegerImpl(
        listOf(
          NestedIntegerImpl(1),
          NestedIntegerImpl(
            listOf(
              NestedIntegerImpl(4),
              NestedIntegerImpl(
                listOf(NestedIntegerImpl(6))
              )
            )
          )
        )
      )
    )

    val iterator = NestedIterator(nestedList)
    val actual = mutableListOf<Int>()
    while (iterator.hasNext()) {
      actual.add(iterator.next())
    }

    assertContentEquals(
      expected = listOf(1, 4, 6),
      actual = actual
    )
  }
}

class NestedIntegerImpl : NestedInteger {
  private var integer: Int?
  private var list: List<NestedInteger>?
  private val isInteger: Boolean

  constructor(integer: Int) {
    this.integer = integer
    this.list = null
    this.isInteger = true
  }

  constructor(list: List<NestedInteger>) {
    this.integer = null
    this.list = list
    this.isInteger = false
  }

  override fun isInteger(): Boolean = isInteger

  override fun getInteger(): Int? = integer
  override fun setInteger(value: Int) {}

  override fun add(ni: NestedInteger) {}

  override fun getList(): List<NestedInteger>? = list
}
