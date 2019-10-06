package one

object Challenge1 {
  def myIdentity[T](arg: T): T = arg

  def compose[A, B, C](f1: A => B, f2: B => C): A => C = x => f2(f1(x))
}
