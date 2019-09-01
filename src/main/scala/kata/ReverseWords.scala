package kata

object ReverseWords {

  def reverseWords(str: String): String = str.split(' ').reverse.mkString(" ")
}
