package kata

import org.scalatest.FlatSpec
import kata.TrailingZeroes.zeros

class TrailingZeroesTest extends FlatSpec {
  it should "work with example tests" in {
    assert(zeros(0) == 0)
    assert(zeros(6) == 1)
    assert(zeros(14) == 2)
  }
}