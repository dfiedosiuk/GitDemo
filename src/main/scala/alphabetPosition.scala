object alphabetPosition extends App {

  def find(text: String) = {
    text
      .toLowerCase
      .toList
      .filter(('a' to 'z').contains(_))
      .map {
        case c if c != ' ' => (c.toInt -96).toString
        case c => c.toString
      }
      .mkString(" ")
  }

  println(find("The sunset sets at twelve o' clock."))

}
