package kata

/* Problem: Reversed Words
Complete the solution so that it reverses all of the words within the string passed in.

Example:

reverseWords("The greatest victory is that which requires no battle")
// "battle no requires which that is victory greatest The"

 */
object ReverseWords {

  def reverseWords(str: String): String = str.split(' ').reverse.mkString(" ")
}
