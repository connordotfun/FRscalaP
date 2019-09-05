package FRscalaP


object Main extends App {


  val input = Signal.input[Int]()

  val b = Signal.map[Int, Float](input, (x: Int) => x.toFloat + 0.1f)
  val c = Signal.map(input, (x: Int) => x.toString)

  val d: Signal[(Float, String)] = Signal.merge(b, c)

  val e = Signal.map(d, ((x: Float, y: String) => x + " is 0.1 higher than " + y).tupled)

  val graph = Signal.output(e)
}
