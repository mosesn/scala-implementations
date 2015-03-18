package com.twitter.scala_impl

import scala.annotation.tailrec

object Spinner {
  val Billion: Long = 1000L * 1000L * 1000L

  @tailrec
  def spin(helloTime: Long, endTime: Long): Unit = {
    val now = System.nanoTime()
    if (now < endTime) {
      if (helloTime < now) {
        println("Still hogging the CPU")
        spin(helloTime + Billion, endTime)
      } else { spin(helloTime, endTime) }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println("I am a CPU hog.")
    val now = System.nanoTime()
    val hour = 60L * 60L * Billion
    spin(now + Billion, now + hour)
  }
}
