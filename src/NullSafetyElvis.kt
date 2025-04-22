fun main() {
    var f: String? = null
//    var f: String? = "abcd"

    val g = f ?: "f is null"
    println(g)

    val length = f?.length ?: -1
    println(length)
}


/*
In the Kotlin code snippet, you're utilizing Kotlin's null safety features to handle
potential null values in a concise and effective manner. Code makes use of the Elvis
operator (`?:`), which provides a default value when the left-hand side expression
evaluates to `null`. Here's how it works:

Code Explanation

1. Declaration of Nullable String `f`:
`var f: String? = null`: Here, `f` is declared as a nullable `String`, and it's initially
set to `null`. This means that any operation on `f` that doesn't account for `null` could
potentially lead to a `NullPointerException` if not handled correctly. You also have a
commented option where `f` could be assigned a non-null value `"abcd"`.

2. Using the Elvis Operator for Default Value (`g`):
`val g = f ?: "f is null"`: This line uses the Elvis operator to assign a value to `g`.
If `f` is `null` (which it is in this initial setup), `g` will be assigned the
value `"f is null"`. If you uncomment and use the `f = "abcd"`, then `g` would be
assigned `"abcd"`.
Output: `"f is null"` when `f` is `null`, and if `f` were `"abcd"`, then `g` would
output `"abcd"`.

3. Using Safe Calls and the Elvis Operator for a Default Length (`length`):
`val length = f?.length ?: -1`: This line attempts to access the `length` property
of `f`. The safe call operator (`?.`) is used to safely attempt accessing `length`
only if `f` is not `null`. If `f` is `null`, the expression immediately to the left
of the Elvis operator (`?:`) evaluates to `null`, and thus `-1` is assigned to
 `length` as a default.
 Output: `-1` when `f` is `null`. If `f` were `"abcd"`, `length` would be `4`,
 since the length of `"abcd"` is 4.

Summary of the Outputs

Given that `f` is set to `null` in the provided code:
`println(g)` will output `"f is null"`.
`println(length)` will output `-1`.

If you were to uncomment the alternate initialization of `f` (`var f: String? = "abcd"`),
the outputs would be:
`println(g)` would output `"abcd"`.
`println(length)` would output `4`.

Conclusion

This example effectively demonstrates how to handle nullable values in Kotlin, providing
default behaviors or values when dealing with `null`. It emphasizes the importance of
managing nullability in Kotlin, which helps avoid common errors like `NullPointerException`
and makes your code safer and more robust. The use of the Elvis operator is particularly
useful for providing fallback values or behaviors when dealing with potentially `null`
expressions.
*/