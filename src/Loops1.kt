fun main() {
    println("1..3")
    for (i in 1..3) {
        print(i) // 1 2 3
    }
    println("\n")

    println("1 until 3")
    for (i in 1 until 3) {
        print(i) // 1 2
    }
    println("\n")

    println("6 downTo 0 step 2")
    for (i in 6 downTo 0 step 2) {
        print(i) // 6 4 2 0
    }

    // https://kotlinlang.org/docs/control-flow.html#for-loops
}


/*
Kotlin code snippet you've provided illustrates how to use various forms of range expressions
in `for` loops. Let's dissect each type of loop and understand the range constructs:


Loop 1: Inclusive Range (`..`)


println("1..3")
for (i in 1..3) {
    print(i) // This will print 1 2 3
}
println("\n")


`1..3` denotes an inclusive range, meaning it includes both endpoints: 1, 2, and 3.
Loop iterates over this range, printing each number followed by a space.
Output: "1 2 3" followed by a newline (`\n`).

Loop 2: Exclusive Range (`until`)


println("1 until 3")
for (i in 1 until 3) {
    print(i) // This will print 1 2
}
println("\n")


`1 until 3` creates a range that includes 1 and goes up to but does not include 3,
effectively covering the numbers 1 and 2.

This uses the `until` keyword, which excludes the end value of the range.
Output: "1 2" followed by a newline.

Loop 3: Descending Range with Step (`downTo` and `step`)


println("6 downTo 0 step 2")
for (i in 6 downTo 0 step 2) {
    print(i) // This will print 6 4 2 0
}


`6 downTo 0 step 2` specifies a descending range from 6 to 0, decreasing by 2 each time.
`downTo` indicates that the loop should count downwards.
`step 2` modifies the loop decrement, telling it to decrement by 2 on each iteration, so
it includes the numbers 6, 4, 2, and 0.

Output: "6 4 2 0"

Summary

These loops demonstrate the flexibility of Kotlin's range expressions, which are highly readable and concise for specifying the bounds and steps of loops:

1. Inclusive Range: Using `..` includes both endpoints.
2. Exclusive Range: Using `until` excludes the upper bound.
3. Descending Range with Specific Steps: Using `downTo` combined with `step` specifies custom downward iterations.

The outputs for your provided code, when run, will look like this:

1..3
1 2 3

1 until 3
1 2

6 downTo 0 step 2
6 4 2 0

These constructs make Kotlin loops very powerful and expressive, suitable for a wide array
of looping needs.
*/




