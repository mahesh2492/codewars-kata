package kata

import org.scalatest._

class SeriesSumTest extends FlatSpec with Matchers {
  val tests = List(
    (1, "1.00"),
    (2, "1.25"),
    (3, "1.39")
  )
  tests.foreach {
    case (input, expected) =>
      s"seriesSum($input)" should s"return $expected" in {
        SeriesSum.seriesSum(input) should be (expected)
      }
  }

}
