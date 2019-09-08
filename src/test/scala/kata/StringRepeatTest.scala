package kata

import org.scalatest.FlatSpec

class StringRepeatTest extends FlatSpec {

  "repeatStr method given counter is 3 and string *" should " return string ***" in {
    assert(StringRepeat.repeatStr(3, "*") == "***")
  }

}