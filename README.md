## scala implementations

This project is intended to be a testbed to understand how different features in
scala are implemented.

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
