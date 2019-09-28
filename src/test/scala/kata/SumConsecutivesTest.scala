package kata

import org.scalatest.FunSuite
import SumConsecutives.sumConsecutives

class SumConsecutivesTest extends FunSuite {

  test("Samples") {
    assert(sumConsecutives(List(1, 4, 4, 4, 0, 4, 3, 3, 1)) === List(1, 12, 0, 4, 6, 1))
    assert(sumConsecutives(List(1, 1, 7, 7, 3)) === List(2, 14, 3))
    assert(sumConsecutives(List(-5, -5, 7, 7, 12, 0)) === List(-10, 14, 12, 0))
    assert(sumConsecutives(List(3, 3, 3, 3, 1)) === List(12, 1))
  }
  
}
