package kata

import org.scalatest.FunSuite
import PyramidArray._

class PyramidArrayTest extends FunSuite {
  test("Sample Tests") {
    assert(pyramid(0) == List[List[Int]]())
    assert(pyramid(1) == List[List[Int]](List(1)))
    assert(pyramid(2) == List[List[Int]](List(1), List(1, 1)))
    assert(pyramid(3) == List[List[Int]](List(1), List(1, 1), List(1, 1, 1)))
  }
}