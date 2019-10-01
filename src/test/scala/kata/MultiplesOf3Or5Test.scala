package kata

import org.scalatest.FunSpec

class MultiplesOf3Or5Test extends FunSpec {

  import MultiplesOf3Or5._

  describe("Multiples of 3 or 5") {
    it("should handle basic cases") {
      assert(solution(10) === 23)
      assert(solution(20) === 78)
    }
  }

}

