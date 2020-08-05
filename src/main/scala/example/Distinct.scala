package example

object Distinct extends App {
  List("홍길동", "임꺽정", "마돈나", "홍길동")
    .distinct
    .foreach(println)
}