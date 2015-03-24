package com.twitter.jmh_benchmark

import org.openjdk.jmh.annotations.Benchmark;

class BranchBenchmark {
  import BranchBenchmark._

  @Benchmark
  def withMatchers(): Int = {
    var i = 0
    var x = 0
    while (i < N) {
      i match {
        case _ if i % 2 == 0 =>
          x += i
        case _ =>
      }
      i += 1
    }
    x
  }

  @Benchmark
  def withoutMatchers(): Int = {
    var i = 0
    var x = 0
    while (i < N) {
      if (i % 2 == 0) {
        x += i
      }
      i += 1
    }
    x
  }
}

object BranchBenchmark {
  val N = 0
}
