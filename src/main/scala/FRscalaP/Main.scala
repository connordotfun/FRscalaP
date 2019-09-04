package FRscalaP

object Main extends App {
  def foo(x: Int, y: Int) = print(x + " and " + y)
  def fooTupled = (foo _).tupled
  val tuple = (10, 10)

  fooTupled(tuple)
}
