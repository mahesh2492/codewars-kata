package kata

import org.scalatest.{FlatSpec, Matchers}

class MultiplicationTest extends FlatSpec with Matchers {

  val tests: List[(Int, Int)] = List(
    (39, 3),
    (4, 0),
    (25, 2),
    (999, 4)
  )

  tests.foreach {
    case (input, expected) =>
      s"determinant($input)" should s"return $expected" in {
        Multiplication.persistence(input) should be (expected)
      }
  }
}
