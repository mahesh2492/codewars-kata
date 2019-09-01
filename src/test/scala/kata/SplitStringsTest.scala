package kata

import org.scalatest.FunSuite

class SplitStringsTest extends FunSuite {

  test("Samples") {
    assert(SplitStrings.solution("asdfadsf") === List("as", "df", "ad", "sf"))
    assert(SplitStrings.solution("asdfads") === List("as", "df", "ad", "s_"))
    assert(SplitStrings.solution("") === List())
    assert(SplitStrings.solution("x") === List("x_"))
  }
  
}
