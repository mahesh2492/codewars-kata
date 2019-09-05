package kata

import org.scalatest.{FunSpec, FunSuite}

class SquaresPerimeterTest extends FunSpec {

  import SquaresPerimeter._

  describe("Example Test Cases") {
    val testCases = Array(
      (5, BigInt(80)), (7, BigInt(216)), (20, BigInt(114624)), (30, BigInt(14098308)),
      (100, BigInt("6002082144827584333104")),
    )

    for( (n, r) <- testCases ) {
      check(n, r)
    }
  }
  def check(n: BigInt, res: BigInt): Unit = {
    val z = perimeter(n)
    it(s"perimeter($n) should be equal to $res") {
      assert(z === res)
    }
  }
}
