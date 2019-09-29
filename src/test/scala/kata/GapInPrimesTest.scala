package kata

import kata.GapInPrimesTest._
import org.scalatest.Assertions._
import org.scalatest._

object GapInPrimesTest {
  private def doTest(g: Int, m: Long, n: Long, expect: String): Unit = {
    val actual: String = GapInPrimes.gap(g, m, n)
    assertResult(expect){actual}
  }
}

class GapInPrimesTest extends FlatSpec {
  it should "pass basic tests" in {
    doTest(2, 100, 100, "")
    doTest(2, 100, 110, "(101,103)")
    doTest(4, 100, 110, "(103,107)")
    doTest(6, 100, 110, "")

  }
}