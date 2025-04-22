fun main() {
    val a = 5
    val b = 8

    var max1 = a
    if (a < b) max1 = b
    println(max1)

    // With else
    val max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    println(max2)

    // As expression
    val max3 = if (a > b) a else b
    println(max3)

    // cannot use ternary operator - does not exist in Kotlin
//    val max4 = (a < b) ? b : a

    // https://kotlinlang.org/docs/control-flow.html#if-expression
}



/*
Kotlin code snippet shows different ways to determine the maximum of two
integers using `if` statements. It highlights how Kotlin handles conditional logic
differently compared to languages that use a ternary operator (e.g., Java or C++).
Here's an explanation of each approach:

Code Breakdown

1. First Approach: Simple If Statement
   `var max1 = a`: Initializes `max1` with the value of `a`.
   `if (a < b) max1 = b`: This `if` statement checks if `a` is less than `b`. If true,
   it assigns the value of `b` to `max1`. This approach changes `max1` only if `a` is
   less than `b`.
   `println(max1)`: Prints the value of `max1`, which will be the maximum of `a` and `b`.

2. Second Approach: If-Else Statement
   `val max2: Int`: Declares a variable `max2` without initializing it immediately.
   `if-else` block is used to assign a value to `max2`. If `a` is greater than
   `b`, `max2` is assigned `a`; otherwise, it is assigned `b`.
   `println(max2)`: Prints the value of `max2`, ensuring that `max2` contains
    the maximum value between `a` and `b`.

3. Third Approach: If Expression
   `val max3 = if (a > b) a else b`: This line demonstrates Kotlin's ability to use
   `if` as an expression. This means it returns a value. Here, `max3` is directly assigned
   the value returned by the `if` expression.
   `println(max3)`: Prints the value of `max3`. This method is concise and idiomatic
    in Kotlin for choosing between two values based on a condition.

Additional Note on Kotlin vs. Other Languages
Comment `// cannot use ternary operator - does not exist in Kotlin` is correct.
Unlike languages like Java, where you might use `condition ? trueValue : falseValue`,
Kotlin uses `if-else` expressions to achieve the same result. This design choice
keeps the language more uniform and avoids having two ways to do the same thing,
which can simplify understanding and maintaining code.

Example Output
Given the values of `a` (5) and `b` (8) in the example:
All three methods (`max1`, `max2`, `max3`) will output `8` because `b` is greater than `a`.

Code snippet effectively demonstrates the flexibility and readability of Kotlin's
control flow statements, particularly highlighting the use of `if` as an expression,
which is a powerful feature for concise code writing.
*/