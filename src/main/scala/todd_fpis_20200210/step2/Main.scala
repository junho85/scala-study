package todd_fpis_20200210.step2

object Main extends App {
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  println(add(1, 2))

  // 리턴을 생략하기
  def addWithoutReturn(x: Int, y: Int): Int = {
    x + y
  }

  // 블럭을 생략하기
  def addWithoutBlock(x: Int, y: Int): Int = x + y

  // 결과 타입은 생략(추론) 가능하나 그러지 마시오
  def addWithoutReturnType(x: Int, y: Int) = x + y
}
