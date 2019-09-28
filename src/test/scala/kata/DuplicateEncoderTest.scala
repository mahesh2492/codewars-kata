package kata

import kata.DuplicateEncoder.duplicateEncode
import org.scalatest.FunSpec

class DuplicateEncoderTest extends FunSpec {

  val basicExamples: Seq[(String, String)] = Seq(
    ("din", "((("),
    ("recede", "()()()"),
    ("Success", ")())())"),
    ("(( @", "))((")
  )

  basicExamples.foreach { case (decoded, encoded) =>
    it(s"should return $encoded for input $decoded") {
      assert(duplicateEncode(decoded) == encoded)
    }
  }
}