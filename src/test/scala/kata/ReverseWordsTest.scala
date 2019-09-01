package kata

import org.scalatest.FunSuite

class ReverseWordsTest extends FunSuite {

  test("Samples") {
    assert(ReverseWords.reverseWords("hello world!") === "world! hello")
  }

}
