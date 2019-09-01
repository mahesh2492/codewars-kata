package kata

object SplitStrings {

  def solution(s: String): List[String] = {
    val input = if(s.length % 2 != 0) s + "_" else s
    input.grouped(2).toList
  }

}
