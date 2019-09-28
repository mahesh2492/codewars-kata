package kata

import kata.BackwardReadPrimes.backwardsPrime
import org.scalatest.FunSuite

class BackwardReadPrimesTest extends FunSuite {
  test("Example Test") {
    var st = 7000
    var nd = 7100
    assert(
      backwardsPrime(st, nd) == "7027,7043,7057",
      s"\nsol: ($st, $nd) should be 7027,7043,7057"
    )
    st = 70000
    nd = 70245
    assert(
      backwardsPrime(st, nd) == "70001,70009,70061,70079,70121,70141,70163,70241",
      s"\nsol: ($st, $nd) should be 70001 70009 70061 70079 70121 70141 70163 70241"
    )
  }
}
