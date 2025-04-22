fun main() {
    val collection = listOf(1, 3, 8, 12, 14, 16)

    for (item in collection) println(item)

    println()

    for (i in collection.indices) {
        println("$i - ${collection[i]}")
    }

    for ((i, item) in collection.withIndex()) {
        println("$i - $item")
    }

    // https://kotlinlang.org/docs/control-flow.html#for-loops
}



/*
Kotlin code showcases different ways to iterate through a collection using `for` loops, demonstrating the flexibility of Kotlin's iteration constructs. Here’s a detailed explanation of each approach used in the code:

Loop 1: Direct Iteration Over Elements


for (item in collection) println(item)


Description: This loop iterates directly over each element in the list `collection`, which contains integers. The `item` variable automatically takes on the value of each element as the loop iterates through the list.
Output: This will print each number in the collection on a new line. Given your collection `[1, 3, 8, 12, 14, 16]`, it prints:

  1
  3
  8
  12
  14
  16


Loop 2: Using Collection Indices


for (i in collection.indices) {
    println("$i - ${collection[i]}")
}


Description: This loop uses `collection.indices` to iterate over the indices of the list.
`collection.indices` is a range covering all valid indices of the list, from `0` to
 `collection.size - 1`.
Output: Prints each index and its corresponding value from the collection. For each
iteration, `i` is the index, and `collection[i]` accesses the element at that index.
Output will be:

  0 - 1
  1 - 3
  2 - 8
  3 - 12
  4 - 14
  5 - 16


Loop 3: Iteration with Index and Element


for ((i, item) in collection.withIndex()) {
    println("$i - $item")
}

Description: This loop uses `collection.withIndex()`, which returns an iterable of pairs,
each consisting of an index and the corresponding element. This allows for easy access to
both the index (`i`) and the element (`item`) in a single loop construct.
Output: Prints each index and its corresponding value similarly to the previous loop, but
this time by destructuring the pairs returned by `withIndex()`.
The output is the same as Loop 2:

  0 - 1
  1 - 3
  2 - 8
  3 - 12
  4 - 14
  5 - 16

Summary

These loops illustrate different but equally powerful ways of iterating through
collections in Kotlin, each suited for different scenarios depending on whether
you need access to just the elements, their indices, or both. Use of `withIndex()`
is particularly idiomatic in Kotlin, offering a concise and readable way to handle
both elements and their indices simultaneously.

These methods are great examples of Kotlin’s expressive power and its ability to
simplify common programming tasks through language features.
*/