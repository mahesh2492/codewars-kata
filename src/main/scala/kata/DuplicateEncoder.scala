package kata

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */
object DuplicateEncoder {

  def duplicateEncode(word: String): String = {
    val hashMap: Map[Char, Int] =
      word.toLowerCase.toSeq.groupBy(identity).map {
        case (k, v) => (k, v.length)
      }

    word.toLowerCase.map {
      case element if hashMap(element) > 1 => ')'
      case _                               => '('
    }
  }

}
