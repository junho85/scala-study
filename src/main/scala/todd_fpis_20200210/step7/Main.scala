package todd_fpis_20200210.step7

object Main extends App {

  // 함수안에 함수
  def factorial2(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  // 꼬리 재귀 최적화
  def factorial3(n: BigInt): BigInt = {
    @annotation.tailrec
    def go(n: BigInt, acc: BigInt): BigInt =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)

  }

  //  println(factorial3(10))

  def fib(n: BigInt): BigInt = {
    @annotation.tailrec
    def go(n: BigInt, now: BigInt, prev: BigInt): BigInt =
      if (n <= 1) now
      else go(n - 1, now + prev, now)

    go(n, 1, 0)
  }

  println(fib(0)) // 0
  println(fib(1)) // 1
  println(fib(2)) // 1
  println(fib(3)) // 2
  println(fib(4)) // 3
  println(fib(5)) // 5
}

