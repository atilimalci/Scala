package tr.aalci.generics

trait Stack [T] {
  def push (t: T)
  def pop : T
}