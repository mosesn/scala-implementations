package com.twitter.scala_impl

class ForComprehension {
  def foreach(seq: Seq[Int]): Unit = for { elt <- seq } println(elt)

  def filter(seq: Seq[Int]): Unit = for { elt <- seq if elt % 2 == 0 } println(elt)

  def map(seq: Seq[Int]): Seq[Int] = for { elt <- seq } yield elt

  def filteredMap(seq: Seq[Int]): Seq[Int] = for { elt <- seq if elt % 2 == 0 } yield elt

  def flatMap(seqOfSeq: Seq[Seq[Int]]): Seq[Int] = for {
    seq <- seqOfSeq
    elt <- seq
  } yield elt
}
