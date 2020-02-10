package todd_fpis_20200210.step5

case class User(name: String)

object Main extends App {
  val user = User("todd")
  val otherUser = User("todd")

  println(user == otherUser) // true

  // setter는 제공하지 않음
  // user.name = "eunmin"
}
