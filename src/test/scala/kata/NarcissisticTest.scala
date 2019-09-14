package kata

import org.scalatest.FunSuite
import kata.Narcissistic.narcissistic

class NarcissisticTest extends FunSuite {

  test("Samples") {
    assert(narcissistic(7))
    assert(narcissistic(371))
    assert(!narcissistic(122))
    assert(!narcissistic(4887))
  }
}
