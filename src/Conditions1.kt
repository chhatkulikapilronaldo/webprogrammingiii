fun main() {
    val a = 5
    val b = 7

    if (a > b) {
        println("a > b")
    } else if (a < b) {
        println("b > a")
    } else {
        println("a is equal to b")
    }

    // can be converted to this:
    when {
        a > b -> {
            println("a > b")
        }
        a < b -> {
            println("b > a")
        }
        else -> {
            println("a is equal to b")
        }
    }

    // and can be simplified to this:
    when {
        a > b -> println("a > b")
        a < b -> println("b > a")
        else -> println("a is equal to b")
    }
}

/*
Kotlin code you've provided shows three ways to compare two variables, `a` and `b`,
and print a message based on their comparison. These examples demonstrate the transition
from a traditional `if-else` statement to a more concise and versatile `when` expression,
and how it can be further simplified. Let’s review each method:

Initial If-Else Statement

This is a straightforward comparison using `if-else`.

if (a > b) {
    println("a > b")
} else if (a < b) {
    println("b > a")
} else {
    println("a is equal to b")
}

If `a` is greater than `b`, it prints `"a > b"`.
If `a` is less than `b`, it prints `"b > a"`.
If neither condition is true, implying `a` is equal to `b`, it prints `"a is equal to b"`.

Given `a = 5` and `b = 7`, the output will be `"b > a"`.

### First When Expression

The `when` expression without a subject replaces the `if-else` block.
This format is especially useful when translating complex `if-else` structures
 into a cleaner and more readable form.


when {
    a > b -> {
        println("a > b")
    }
    a < b -> {
        println("b > a")
    }
    else -> {
        println("a is equal to b")
    }
}


This does the same as the `if-else` statement but utilizes the `when` structure.
It checks each condition one by one:


It evaluates whether `a > b` and executes the corresponding block if true.
If not, it checks `a < b` and executes that block if true.
If none of the above conditions match, it executes the `else` block.


Simplified When Expression

This is a more streamlined version of the `when` expression, where the curly braces
are removed because each branch contains only a single statement. This is the most
concise version.


when {
    a > b -> println("a > b")
    a < b -> println("b > a")
    else -> println("a is equal to b")
}


It behaves identically to the previous `when` statement but is more succinct.

Conclusion

All three methods yield the same result for the given values of `a` and `b`:


b > a
b > a
b > a


These examples effectively illustrate Kotlin's flexibility in handling conditional logic, offering a neat and powerful alternative to traditional `if-else` structures with `when` expressions. The use of `when` not only makes the code more readable but also easier to maintain, especially as conditions or logic become more complex.
*/

