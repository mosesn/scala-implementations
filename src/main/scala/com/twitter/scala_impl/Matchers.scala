package com.twitter.scala_impl

class Matchers {
  def doMatch(opt: Option[Int]): Unit = opt match {
    case None => println("nada")
    case Some(num: Int) if num % 2 == 0 => println("even")
    case Some(num: Int) => println("odd")
  }
}
