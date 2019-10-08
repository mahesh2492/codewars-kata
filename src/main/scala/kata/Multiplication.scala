package kata

/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit:
 persistence(39) == 3

 // because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2
 persistence(999) == 4

 // because 4 is already a one-digit number:
 persistence(4) == 0
 */
object Multiplication {

  def persistence(n: Int): Int = {
    @scala.annotation.tailrec
    def persist(n: String, steps: Int): Int = {
      if(n.length == 1) steps
      else  {
        val res = n.map(_.asDigit).toList.product
        persist(res.toString, steps + 1)
      }

    }
    persist(n.toString, 0).toInt

  }
}