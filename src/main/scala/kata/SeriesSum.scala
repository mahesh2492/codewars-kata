package kata

/*
https://www.codewars.com/kata/555eded1ad94b00403000071/scala
 */
object SeriesSum {

  def seriesSum(n: Int): String = {
    @scala.annotation.tailrec
    def sumRec(result: Double, counter: Int): Double = {
      if (n - 1 == counter) {
        result
      } else {
        sumRec(result + 1D / (2 * (counter + 2) + counter), counter + 1)
      }
    }

    if (n == 0) {
      "0.00"
    } else {
      BigDecimal(sumRec(1.00, 0))
        .setScale(2, BigDecimal.RoundingMode.HALF_UP).toString
    }
  }

}
