package example

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
  println(ages)

  val ages2 = List.fill(5)(Seq(1))
  println(ages2)
}
