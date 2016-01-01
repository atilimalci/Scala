package tr.aalci.generics

class ListStack[T]() extends Stack[T] {
  private var elements: List[T] = List()

  override def push(t: T): Unit = {
    elements = t +: elements
  }

  override def pop: T = {
    if (elements.isEmpty)
      throw new IndexOutOfBoundsException
    val head = elements.head
    elements = elements.tail
    head
  }
}

object ListStack {
  def main(args: Array[String]) {
    val stack = new ListStack[String]
    stack.push("C")
    stack.push("B")
    stack.push("A")
    val element: String = stack.pop
    println(element)
  }
}