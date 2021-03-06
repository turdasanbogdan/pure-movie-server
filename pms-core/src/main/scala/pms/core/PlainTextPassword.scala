package pms.core

import busymachines.core.InvalidInputFailure
import pms.effects._

/**
  *
  * @author Lorand Szakacs, https://github.com/lorandszakacs
  * @since 20 Jun 2018
  *
  */
object PlainTextPassword {

  //TODO: make these restrictions configurable
  def apply(pw: String): Result[PlainTextPassword] =
    if (pw.length < 6)
      Result.fail(InvalidInputFailure("Password needs to have at least 6 characters"))
    else Result.pure(new PlainTextPassword(pw))

}

final class PlainTextPassword private (val plainText: String) {

  //generated by IntelliJ
  override def equals(other: Any): Boolean = other match {
    case that: PlainTextPassword =>
      plainText == that.plainText
    case _ => false
  }

  //generated by IntelliJ
  override def hashCode(): Int =
    31 * plainText.hashCode
}
