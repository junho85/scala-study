package todd_fpis_20200210.step16

object Main extends App {
  val map = Map("todd" -> 1, "eunmin" -> 2)

  val id: Option[Int] = map.get("todd")

  println(id)

  val id2 = map.get("unknown")

  println(id2)

//  map.get("todd") + map.get("eunmin") = ???

  // 이런걸 원하는건 아님
  println(map.getOrElse("todd", 0) + map.getOrElse("eunmin", 0))
  println(map.values.sum)

  // 둘중 하나라도 값이 없으면 None 이 나와야함
  // 정상이면 Some(숫자값)
  def sumTwoKey(key1: String, key2: String): Option[Int] = (map.get(key1), map.get(key2)) match {
    case (Some(a), Some(b)) => Some(a + b)
    case _ => None
  }

  println(sumTwoKey("todd", "eunmin")) // Some(3)
  println(sumTwoKey("no", "eunmin")) // None
  println(sumTwoKey("todd", "no")) // None

  def incKey(key: String): Option[Int] = (map.get(key)) match {
    case Some(a) => Some(a + 1)
    case _ => None
  }

  println(incKey("todd")) // Some(2)
  println(incKey("no")) // None
}
