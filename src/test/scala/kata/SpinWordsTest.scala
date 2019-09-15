package kata

import kata.SpinWords.spinWords
import org.scalatest.FunSpec

class SpinWordsTest extends FunSpec {
  describe("spinWords") {
    it("should work with example tests") {
      assertResult ("emocleW") {spinWords("Welcome")}
      assertResult ("Hey wollef sroirraw") {spinWords("Hey fellow warriors")}
      assertResult ("This is a test") {spinWords("This is a test")}
      assertResult ("This is rehtona test") {spinWords("This is another test")}
      assertResult ("You are tsomla to the last test") {spinWords("You are almost to the last test")}
      assertResult ("Just gniddik ereht is llits one more") {spinWords("Just kidding there is still one more")}
      assertResult ("ylsuoireS this is the last one") {spinWords("Seriously this is the last one")}
    }
  }
}

