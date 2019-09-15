package kata

object SpinWords {

  def spinWords(sentence: String): String = {
    val arr = sentence.split(" ")
    val result =
      for {
        i <- arr
        s = if(i.length >= 5) i.reverse else i
      }  yield s
    result.mkString(" ")
  }

}
