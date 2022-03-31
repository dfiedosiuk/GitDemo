import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest._
import flatspec._
import matchers._


class alphabetPositionSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An find(text: String)"

  it should "return each order of each letter in alphabet" in {
    alphabetPosition.find("The sunset sets at twelve o' clock.") shouldBe "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
  }

}
