package tr.aalci.inheritance

trait Sortable[A <: Ordered[A]] extends Iterable[A] {
  def sort: Seq[A] = {
    this.toList.sorted
  }
  
}