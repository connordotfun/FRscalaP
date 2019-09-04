package FRscalaP

class Event[T](val value: T, val time: Long) {


  def map[V](func: T => V): Event[V] = {
    new Event[V](func(value), time)
  }
}
