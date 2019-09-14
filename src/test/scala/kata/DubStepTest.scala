package kata

import org.scalatest.{FlatSpec, Matchers}
import kata.DubStep._

class DubStepTest extends FlatSpec with Matchers {

  val tests = List(
    ("AWUBBWUBC", "A B C", "WUB should be replaced by 1 space"),
    ("AWUBWUBWUBBWUBWUBWUBC", "A B C", "multiples WUB should be replaced by only 1 space"),
    ("WUBAWUBBWUBCWUB", "A B C", "heading or trailing spaces should be removed")
  )

  tests.foreach {
    case (input, expected, message) =>
      s"songDecoder($input)" should s"return $expected" in {
        withClue(message) { songDecoder(input) should be (expected) }
      }
  }
}
