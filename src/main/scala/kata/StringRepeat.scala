package kata

object StringRepeat {
  def repeatStr(times: Int, str: String): String = {
    List.fill(times)(str).mkString("")
  }
}
