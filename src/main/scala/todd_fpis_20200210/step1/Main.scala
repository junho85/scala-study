package todd_fpis_20200210.step1

// object는 싱글톤 인스턴스를 만드는 문법 (static 메서드가 없음)
// main 함수를 만들어서 실행하기
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}

object AnotherMain extends App {
  println("Hello World2")
}