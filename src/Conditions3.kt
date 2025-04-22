fun main() {
    val x = 5
    val y = -1

    if (x > 0 && y > 0) { // AND
        println("both positive")
    } else {
        println("at least one is negative or zero")
    }

    if (x > 0 || y > 0) { // OR
        println("at least one is positive")
    }

    if (!(x > 0)) { // NOT
        println("x is negative or zero")
    }
}


/*
Kotlin code snippet demonstrates the use of logical operators: `&&` (AND), `||` (OR),
and `!` (NOT) within `if` statements to evaluate conditions based on the values of the
variables `x` and `y`. Here's an explanation of each logical operation and the expected
outputs when this code is executed:

Code Explanation:

1. Initialization:
   `val x = 5`: Initializes `x` with the value 5.
   `val y = -1`: Initializes `y` with the value -1.

2. First If Statement (AND Operator):
   `if (x > 0 && y > 0)`: This checks if both `x` and `y` are greater than 0. Since `x` is 5
   (positive) but `y` is -1 (negative), the condition evaluates to `false`.
   Output: `"at least one is negative or zero"` is printed because the `else` block
   executes when the AND condition fails.

3. Second If Statement (OR Operator):
   `if (x > 0 || y > 0)`: This checks if at least one of `x` or `y` is greater than 0.
   Here, `x` is 5, which is positive, so even though `y` is negative, the condition
   evaluates to `true`.
   Output: `"at least one is positive"` is printed because the OR condition is
   satisfied by `x`.

4. Third If Statement (NOT Operator):
   `if (!(x > 0))`: This checks if `x` is not greater than 0, using the NOT operator
   to invert the condition `x > 0`. Since `x` is 5, `x > 0` is `true`, and `!(x > 0)`
   is `false`.
   No Output from this statement because `x` is indeed greater than 0, so the condition
   inside the `if` statement evaluates to `false` and nothing is printed.

Expected Output:

Given the values of `x` and `y` and the conditions set in the `if` statements,
 the output when this program is run will be:

at least one is negative or zero
at least one is positive

This output reflects the correct functioning of logical operators in controlling
the flow of execution based on multiple conditions. Each operator (`&&`, `||`, `!`)
 is effectively demonstrated with these variable conditions.
*/
