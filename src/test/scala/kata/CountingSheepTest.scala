package kata

import org.scalatest._
import kata.CountingSheep._

class CountingSheepTest extends FlatSpec with Matchers {
  "countingSheep" should "return correct data" in {
    countingSheep(1) should be ("1 sheep...")
    countingSheep(2) should be ("1 sheep...2 sheep...")
    countingSheep(3) should be ("1 sheep...2 sheep...3 sheep...")
  }
}

