package kata

import org.scalatest.FunSuite
import kata.MissingLetters._

class MissingLettersTest extends FunSuite {

  test("Samples") {
    assert(findMissingLetter(Array('a', 'b', 'c', 'd', 'f')) === 'e')
    assert(findMissingLetter(Array('O', 'Q', 'R', 'S')) === 'P')
  }
}
