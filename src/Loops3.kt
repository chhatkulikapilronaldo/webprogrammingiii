fun main() {
    var x = 5

    while (x > 0) {
        println(x)
        x--
    }
    println()

    do {
        val y = Math.random()
        println(y)
    } while (y < 0.8) // y is visible here
}

/*
Kotlin code demonstrates two fundamental looping constructs: the `while` loop and
the `do-while` loop. Let's analyze each loop and highlight some key points and
corrections needed.

`while` Loop

var x = 5

while (x > 0) {
    println(x)
    x--
}
println()


Description: This loop begins with `x` initialized to 5. It checks if `x` is greater than 0 and if true, prints the value of `x`. After printing, it decrements `x` by 1. The loop continues until `x` is no longer greater than 0.
Output: The numbers 5 through 1 are printed each on a new line. After `x` decrements to 0, the condition `x > 0` fails, and the loop exits.

`do-while` Loop


do {
    val y = Math.random()
    println(y)
} while (y < 0.8)


Description: `do-while` loop is designed to execute its contents at least once,
regardless of the condition at the beginning. Here, `y` is defined within the loop
and is assigned a random double between 0.0 and 1.0 (inclusive of 0.0 and
exclusive of 1.0). Each value of `y` is then printed.
Error: Scope of `y` is confined to the inside of the `do` block. Hence, it is not
visible or accessible in the `while` condition outside the `do` block. This is a
common mistake when porting loop logic from languages like JavaScript, where block
scope behaves differently. In Kotlin, you'll get a compile-time error due to `y` not
being accessible in the loop condition.

Correction for the `do-while` Loop

To fix the scope issue of `y` in the `do-while` loop, `y` should be declared before the loop starts. Here’s a corrected version:

var y: Double // Declare y outside the loop
do {
    y = Math.random()
    println(y)
} while (y < 0.8)


Changes: Now `y` is declared outside the `do` block, which makes it accessible in the `while` condition after the block. This corrects the scope issue.
Output: The loop will print random values and will continue doing so until a random number generated is 0.8 or greater.

Summary of Expected Outputs

For the `while` loop:

5
4
3
2
1

For the `do-while` loop (the output will vary since it depends on random numbers):

0.54723... // example values, will vary on each run
0.12345...
0.85632... // example termination condition when y >= 0.8


These loops provide good examples of using control structures for iteration in Kotlin,
demonstrating the importance of variable scope and loop conditions in programming.
*/