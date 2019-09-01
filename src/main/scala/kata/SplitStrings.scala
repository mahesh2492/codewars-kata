package kata

/* Problem: Split Strings
Complete the solution so that it splits the string into pairs of two characters. If the string contains an
odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
Examples:

solution('abc')    // should return List("ab", "c_")
solution('abcdef') // should return List("ab", "cd", "ef")

 */
object SplitStrings {

  def solution(s: String): List[String] = {
    val input = if(s.length % 2 != 0) s + "_" else s
    input.grouped(2).toList
  }

}
