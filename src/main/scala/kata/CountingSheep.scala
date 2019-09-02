package kata

object CountingSheep {

  def countingSheep(num: Int): String = {
    (for( i <- 1 to num) yield s"$i sheep...").mkString("")
  }

}
