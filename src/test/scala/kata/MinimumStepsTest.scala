package kata

import org.scalatest.{FlatSpec, Matchers}
import kata.MinimumSteps.minimumSteps

class MinimumStepsTest extends FlatSpec with Matchers {

  "minimum steps tests" should "be ok" in {
    minimumSteps(Array( 4,  6,  3), 7) should be (1)
    minimumSteps(Array(10,  9,  9, 8), 17) should be (1)
    minimumSteps(Array( 8,  9,  4, 2), 23) should be (3)
    minimumSteps(Array(19, 98, 69, 28, 75, 45, 17, 98, 67), 464) should be (8)
  }
}