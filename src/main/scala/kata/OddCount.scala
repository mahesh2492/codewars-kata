package kata

/*
  Problem: Count Odd Numbers below n
  Given a number n, return the number of positive odd numbers below n, EASY!

  oddCount(7) //=> 3, i.e [1, 3, 5]
  oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13]

  Expect large Inputs!
 */
object OddCount {

  def oddCount(n: Long): Long = {
    if(n % 2 == 0) n/2
    else
      (n - 1)/2
  }

}
