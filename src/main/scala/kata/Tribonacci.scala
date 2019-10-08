package kata

object Tribonacci {

  @scala.annotation.tailrec
  def tribonacci[T: Numeric](signature: List[T], n: Int): List[T] = {
    lazy val updatedSignature = signature ::: List(signature.takeRight(3).sum)
    if (n == 0) {
      List.empty[T]
    } else if(n <= 3) {
      signature.take(n)
    } else if (updatedSignature.size < n) {
      tribonacci(updatedSignature, n)
    } else {
      updatedSignature
    }
  }

}