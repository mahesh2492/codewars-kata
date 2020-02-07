package kata

import org.scalatest.FlatSpec

class DeadFishTest extends FlatSpec {
  it should "work with example tests" in {
    assert(DeadFish.parse("iiisdoso") == List(8, 64))
    assert(DeadFish.parse("iiisdosodddddiso") == List(8, 64, 3600))
  }
}
