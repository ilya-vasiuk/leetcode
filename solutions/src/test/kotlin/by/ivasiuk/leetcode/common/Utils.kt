package by.ivasiuk.leetcode.common

import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

fun assertInnerCollectionsContentEquals(
    actual: List<List<Any>>,
    expected: List<List<Any>>,
) {
    assertEquals(actual.size, expected.size)
    for (i in expected.indices) {
        assertContentEquals(expected[i], actual[i])
    }
}

fun assertInnerCollectionsContentEquals(
    actual: Array<IntArray>,
    expected: Array<IntArray>,
) {
    assertEquals(actual.size, expected.size)
    for (i in expected.indices) {
        assertContentEquals(expected[i], actual[i])
    }
}

fun assertInnerCollectionsContentEquals(
    actual: Array<CharArray>,
    expected: Array<CharArray>,
) {
    assertEquals(actual.size, expected.size)
    for (i in expected.indices) {
        assertContentEquals(expected[i], actual[i])
    }
}