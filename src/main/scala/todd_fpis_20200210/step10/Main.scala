package todd_fpis_20200210.step10

// ADT (Union Type)
sealed trait Json
case class JString(value: String) extends Json
case class JNumber(value: Int) extends Json


object Main extends App {

  val string = JString("test")
  val number = JNumber(1)

  def printJson(json: Json) : Unit = {
    if (json.isInstanceOf[JString]) {
      println(s"${'"'}${json.asInstanceOf[JString].value}${'"'}")
    } else if (json.isInstanceOf[JNumber]) {
      println()
    }
  }
}
