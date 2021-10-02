package models

import play.api.libs.json._

case class Person(id: Long, name: String, age: Int) {

  def wasBorn(currentYear: Int): Long = currentYear - age
}

object Person {  
  implicit val personFormat = Json.format[Person]



}
