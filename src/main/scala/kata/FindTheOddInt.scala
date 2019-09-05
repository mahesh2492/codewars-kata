package kata

/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

 */
object FindTheOddInt {

  def findOdd(xs: Seq[Int]): Int = {
    xs.view
      .groupBy(identity)
      .values
      .filter(_.size % 2 != 0)
      .toList.flatten.head

  }

}
