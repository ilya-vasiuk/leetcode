package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class GoalParserInterpretationTest {
  private val solution = GoalParserInterpretation()

  @Test
  fun example1() {
    assertEquals(
      expected = "Goal",
      actual = solution.interpret(
        command = "G()(al)"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "Gooooal",
      actual = solution.interpret(
        command = "G()()()()(al)"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "alGalooG",
      actual = solution.interpret(
        command = "(al)G(al)()()G"
      )
    )
  }
}
