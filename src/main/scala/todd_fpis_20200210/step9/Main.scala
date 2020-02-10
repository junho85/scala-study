package todd_fpis_20200210.step9

object Main extends App {
  // 함수 제너릭 [T]
  def printAnything[T](value: T): Unit = {
    println(value)
  }

  printAnything("string")
  printAnything(1)

  // 클래스 제너릭
  case class Container[T](value: T)

  val container = Container(1)
  printAnything(container.value)

  val container2 = Container("hello")
  printAnything(container2.value)

}
