package kata

/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.

 */
object Mumbling {

  def accum(s: String): String = {
    s.zip(1 to s.length)
      .map {
        case (k, v) => List.fill(v)(k.toLower).mkString("").capitalize
      }.mkString("-")
  }

}
