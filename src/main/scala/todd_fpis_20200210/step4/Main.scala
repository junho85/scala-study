package todd_fpis_20200210.step4

class User(val name: String)
//class User(val name: String) {
//  override def equals(obj: Any): Boolean = this.name.equals(name)
//}

object Main extends App {
  val user = new User("todd")

  // getter 호출
  println(user.name)

  // val은 setter를 제공하지 않음, var을 쓰면 할당 가능
  // user.name = "eunmin"
  val otherUser = new User("todd")

  println(otherUser == user) // false
  // equals 를 오버라이드 해서 구현해 주어야 한다. 단, case class 는 자동으로 만들어 준다.
}
