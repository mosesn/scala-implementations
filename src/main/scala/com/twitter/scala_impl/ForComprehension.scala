package com.twitter.scala_impl

import scala.annotation.tailrec

class ForComprehension {
  def foreach(seq: Seq[Int]): Unit = for { elt <- seq } println(elt)
}
