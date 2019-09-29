package kata

import org.scalatest._

class StepInPrimesTest extends FlatSpec {
  "StepInprimes.step" should "pass fixed tests" in {
    assertResult("(101,103)"){StepInPrimes.step(2, 100, 110)}
    assertResult("(30109,30113)"){StepInPrimes.step(4, 30000, 100000)}
    assertResult(""){StepInPrimes.step(11, 30000, 100000)}
  }
}