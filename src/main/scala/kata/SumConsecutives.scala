package kata

object SumConsecutives {

  def pack(l: List[Int]): List[Int] = {
    def packHelper(l: List[Int], result: List[Int]): List[Int] = {
      l match  {
        case Nil => result
        case head::_ =>
          val (first, second) = l.span( _ == head)
          packHelper(second, first.sum :: result)
      }
    }
    packHelper(l, Nil).reverse
  }

  def sumConsecutives(xs: List[Int]): List[Int] =
    pack(xs)
}
