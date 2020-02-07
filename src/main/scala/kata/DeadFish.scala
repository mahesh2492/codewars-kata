package kata

/*
https://www.codewars.com/kata/51e0007c1f9378fa810002a9/scala
 */
object DeadFish {

  def parse(str: String): List[Int] = {
    @scala.annotation.tailrec
    def parseRecur(code: List[Char], result: List[Int], current: Int): List[Int] = {
      code match {
        case Nil => result
        case head::rest if head == 'i' => parseRecur(rest, result, current + 1)
        case head::rest if head == 's' => parseRecur(rest, result, current * current)
        case head::rest if head == 'd' => parseRecur(rest, result, current - 1)
        case head::rest if head == 'o' => parseRecur(rest, current :: result, current)
      }
    }

    parseRecur(str.toCharArray.toList, Nil, 0).reverse

  }

}
