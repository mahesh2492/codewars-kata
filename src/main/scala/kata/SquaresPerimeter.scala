package kata

import scala.annotation.tailrec
/*
  ProblemPerimeter of squares in a rectangle
  Link: https://www.codewars.com/kata/perimeter-of-squares-in-a-rectangle/scala
 */
object SquaresPerimeter {

  def perimeter(n: BigInt): BigInt = 4 * (fib(n + 2) - 1)

  @tailrec
  def fib(n: BigInt, prev: BigInt = 1, next: BigInt = 1): BigInt = n match {
    case _ if n == BigInt(0)  => prev
    case _ if n == BigInt(1)  => next
    case _ => fib(n -1, next, prev + next)
  }

}
