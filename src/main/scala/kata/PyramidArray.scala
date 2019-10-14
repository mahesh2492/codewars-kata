package kata

/*
Write a function that when given a number >= 0, returns an Array of ascending length subarrays.

pyramid(0) => [ ]
pyramid(1) => [ [1] ]
pyramid(2) => [ [1], [1, 1] ]
pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]

Note: the subarrays should be filled with 1s

 */
object PyramidArray {

  def pyramid(n: Int): List[List[Int]] = {
    (for( i <- 1 to n) yield List.fill(i)(1)).toList
  }

}
