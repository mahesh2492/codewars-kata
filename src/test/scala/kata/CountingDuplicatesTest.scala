package kata

import org.scalatest.{FlatSpec, Matchers}

class CountingDuplicatesTest extends FlatSpec with Matchers {

  "duplicateCount(\"abcde\")" should "return 0" in {
    Dups.duplicateCount("abcde") should be (0)
  }

  "duplicateCount(\"abcdea\")" should "return 1" in {
    Dups.duplicateCount("abcdea") should be (1)
  }

  "duplicateCount(\"indivisibility\")" should "return 1" in {
    Dups.duplicateCount("indivisibility") should be (1)
  }

}

