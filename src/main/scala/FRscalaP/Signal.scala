package FRscalaP

class Signal[T]() {

}

class Graph() {

}

object Signal {

  def input[T](): Signal[T] = new Signal[T]

  def map[T, V](signal: Signal[T], func: T => V): Signal[V] = ???

  def merge[T, V](first: Signal[T], second: Signal[V]): Signal[(T, V)] = ???

  def output[T](signal: Signal[T]): Graph = ???
}
