package FRscalaP

class Node[T, V](val func: T => V) {


  def inputSignal =
    new Signal[T]

  def outputSignal =
    new Signal[V]
}
