package kata

import kata.RevRot.revRot
import org.scalatest.FlatSpec

class RevRotTest extends FlatSpec {
  it should "pass basic tests" in {
    assert(revRot("1234", 0) == "")
    assert(revRot("", 0) == "")
    assert(revRot("1234", 5) == "")
    var s: String = "733049910872815764"
    assert(revRot(s, 5) == "330479108928157")
    s = "73304991087281576455176044327690580265896"
    assert(revRot(s, 8) == "1994033775182780067155464327690480265895")
  }

}

