package kata

import org.scalatest.FunSuite
import kata.BitCounting.countBits

class BitCountingTest extends FunSuite {

  test("Samples") {
    assert(countBits(0)  === 0)
    assert(countBits(4)  === 1)
    assert(countBits(7)  === 3)
    assert(countBits(9)  === 2)
    assert(countBits(10) === 2)
  }

}
