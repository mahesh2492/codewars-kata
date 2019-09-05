package kata

import kata.FindTheOddInt.findOdd
import org.scalatest.FunSuite

class FindTheOddIntTest extends FunSuite {

  test("pass all tests") {

    assert(findOdd(List(20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5)) == 5)
    assert(findOdd(List(1,1,2,-2,5,2,4,4,-1,-2,5)) == -1)
    assert(findOdd(List(20,1,1,2,2,3,3,5,5,4,20,4,5)) == 5)
    assert(findOdd(List(10)) == 10)
    assert(findOdd(List(1,1,1,1,1,1,10,1,1,1,1)) == 10)
    assert(findOdd(List(5,4,3,2,1,5,4,3,2,10,10)) == 1)
  }

}

