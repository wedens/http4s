package org.http4s.util

import scala.util.control.NoStackTrace

/** Exception dealing with invalid body
  * @param msg description if what makes the body invalid
  */
case class InvalidBodyException(msg: String) extends Exception(msg) with NoStackTrace