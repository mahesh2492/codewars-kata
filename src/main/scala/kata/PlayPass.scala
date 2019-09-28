package kata

/*
Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references. You can get your passphrases stronger by different means. One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,

    shift each letter by a given number but the transformed letter must be a letter (circular shift),
    replace each digit by its complement to 9,
    keep such as non alphabetic and non digit characters,
    downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
    reverse the whole result.

#Example:

your text: "BORN IN 2015!", shift 1

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"
 */
object PlayPass {

  def playPass(s: String, n: Int): String = {
    s.toUpperCase.zipWithIndex.map {
      case (x: Char, index: Int) if x >= 65 && x <= 90 =>
        val res = if (x + n > 90) (64 + ((x + n) - 90)).toChar else (x + n).toChar
        if (index % 2 == 0) res.toUpper else res.toLower
      case (x: Char, _) if x >= 48 && x < 58           => (48 + (9 - x.asDigit)).toChar
      case (x, _)                                      => x
    }.mkString("").reverse
  }

}
