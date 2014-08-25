package $organization$.$name;format="lower,word"$

import org.saddle._

object App {
  def main(args: Array[String]) {
    val s1 = Series(Vec(1,2,3), Index("a", "b", "c"))
    val s2 = Series(Vec(3,2,1), Index("b", "c", "d"))
    println(s1 + s2)
  }
}

