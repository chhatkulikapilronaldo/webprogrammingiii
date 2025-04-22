fun main() {
    val a = 2

    when (a) {
        1 -> print("a == 1")
        2 -> print("a == 2")
        else -> { // block is necessary
            println("a is neither 1 nor 2")
            print("a is $a")
        }
    }
    println()

    when (a) {
        1, 2 -> print("a is 1 or 2")
        3, 4, 6 -> print("a is 3 or 4 or 6")
        else -> print("a is something else") // block is not necessary
    }
}


/*
Kotlin code uses the `when` expression to demonstrate conditional logic,
similar to the `switch` statement in other languages like Java or C++.
The `when` statement in Kotlin is more powerful and flexible.
Let's break down how it functions in your code:

First `when` Expression:
This block checks the value of `a`, which is set to 2.

val a = 2

when (a) {
    1 -> print("a == 1")
    2 -> print("a == 2")
    else -> { // block is necessary
        println("a is neither 1 nor 2")
        print("a is $a")
    }
}
println()

For case `1`, it would print `"a == 1"` if `a` were 1.
For case `2`, it prints `"a == 2"` since `a` is indeed 2.
`else` case includes a block of code that is executed if `a` doesn't match
any of the specified conditions. However, since `a` is 2, this block is not executed
in this scenario.

Output: `"a == 2"` followed by a newline due to `println()`.

Second `when` Expression:
This block is a more compact use of the `when` expression, showing how multiple
values can be combined in a single case.


when (a) {
    1, 2 -> print("a is 1 or 2")
    3, 4, 6 -> print("a is 3 or 4 or 6")
    else -> print("a is something else") // block is not necessary
}

First case `1, 2` matches if `a` is either 1 or 2. Since `a` is 2, it prints `"a is 1 or 2"`.
Second case `3, 4, 6` would handle values 3, 4, or 6, but `a` is not any of these.
`else` case would handle all other values, but it's not reached since `a` matches one of
the earlier conditions.

Output: `"a is 1 or 2"`

Full Output of the Program:
Program prints the following based on the input and conditions:

a == 2
a is 1 or 2

This shows how effectively Kotlin's `when` statement manages multiple conditions
and executes corresponding actions, providing a clear, concise way to handle
conditional branching.
*/
