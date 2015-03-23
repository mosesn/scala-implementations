## scala implementations

This project is intended to be a testbed to understand how different features in
scala are implemented.

# Examples

## For Comprehensions

```bash
scalac -print ./src/main/scala/com/twitter/scala_impl/ForComprehension.scala
```

How are different components implemented?

## Lazy Vals

```bash
scalac -print ./src/main/scala/com/twitter/scala_impl/LazyVal.scala
```

What are some potential pitfalls here?  How else might we implement this?

## Matchers

```bash
scalac -print ./src/main/scala/com/twitter/scala_impl/Matchers.scala
```

How is the scala compiler smart here?  Could it be any smarter?

## Trait With Behavior

```bash
scalac ./src/main/scala/com/twitter/scala_impl/TraitWithBehavior.scala
javap -c com.twitter.scala_impl.TraitWithBehavior
javap -c com.twitter.scala_impl.TraitWithBehavior\$class
```

What is going on here?  Why is this implemented this way?

# Mysteries

## The Scarlet Java Compatibility

```bash
scalac ./src/main/scala/com/twitter/scala_impl/ScarletJavaCompat.scala
javac ./src/main/java/com/twitter/scala_impl/ScarletJavaUsage.java
```

How does this work under the hood?

# MicroBenchmarks

MicroBenchmarks are notoriously hard to write, but it's very important to write
them so that you understand whether your optimizations are actually useful.

What are common pitfalls in writing benchmarks?

Let's try running a benchmark.  You can inspect the code in
`./src/main/scala/com/twitter/jmh_benchmark/BranchBenchmark.scala`.

You can run it by starting the sbt console (`./sbt`) and while in the console,
running a benchmark (`run -i 20 -wi 10 -f1 -t1 .*Branch.*`).

Is this what you expected to see?  Why or why not?
