package kata

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.

 */
object VowelCount {

  def getCount(inputStr: String): Int = {
    val vowels = List('a', 'e', 'i', 'o', 'u')
    vowels.flatMap { v =>
      inputStr.toSeq.groupBy(identity).get(v).map(_.length)
    }.sum

  }

}
