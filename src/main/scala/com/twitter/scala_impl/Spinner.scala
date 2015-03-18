package com.twitter.scala_impl

import scala.annotation.tailrec

object Spinner {

  val Billion: Long = 1000L * 1000L * 1000L

  @tailrec
  def spin(helloTime: Long): Unit = {
    if (helloTime < System.nanoTime()) {
      println("Still hogging the CPU")
      spin(helloTime + Billion)
    } else spin(helloTime)
  }

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println("I am a CPU hog.")
    spin(System.nanoTime() + Billion)
  }
}
