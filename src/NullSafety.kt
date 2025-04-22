fun main() {
    var a = "hello"
//    a = null // a cannot be assigned null
//    a = getNullString()

    var b: String? = "hello"
//    b = null // b is of type String? and it can be null
//    b = getNullString()

    println(a.length) // ok to do that
//    println(b.length) // NOT ok to do that, compilation error
    // necessary to check
    println(b?.length) // if b is null then it does not ask for its length
//    println(if (b != null) b.length else "null") // long version of the previous line
    println(b!!.length) // DANGEROUS operation, if b is null then exception is thrown
}

fun getNullString(): String? {
    return null
}


/*
Kotlin code snippet you've provided is a great example to demonstrate Kotlin's type safety
features, especially in relation to nullable and non-nullable types. Here's a detailed
explanation of each part of the code:

Handling Nullable and Non-Nullable Variables

1. Non-Nullable Variable (`a`):
   `var a = "hello"`: Here, `a` is declared as a non-nullable `String`. Kotlin infers
   its type as `String`, not `String?`, which means it cannot hold `null`.
   `// a = null`: This commented line, if uncommented, would result in a compilation
    error because `a` cannot be assigned `null`.
   `// a = getNullString()`: This would also result in a compilation error for the
   same reason—the method `getNullString()` returns a `String?`, which could be `null`.

2. Nullable Variable (`b`):
   `var b: String? = "hello"`: `b` is explicitly declared as a nullable
   `String` (`String?`), meaning it can hold `null`.
   `// b = null`: This line is perfectly valid for `b` since it's declared as nullable.
   `// b = getNullString()`: This is also valid as `getNullString()` returns
   a `String?`, compatible with `b`'s declared type.

Accessing Properties on Nullable Types

3. Accessing Properties and Methods:
   `println(a.length)`: It is safe to directly access properties or methods
   like `length` on `a` because it is non-nullable, and Kotlin guarantees
   that it won't be `null` at this point.
   `// println(b.length)`: This line, if uncommented, would result in a
   compilation error. Since `b` is nullable, directly accessing its properties
   or methods without a null check or safe call could lead to a `NullPointerException`.
   `println(b?.length)`: This uses the safe call operator (`?.`), which checks
   if `b` is not `null` before accessing `length`. If `b` is `null`, this
   expression evaluates to `null` and no method is called, preventing any exception.
   `// println(if (b != null) b.length else "null")`: This is the explicit long
   form of handling nullability with an if-else statement. It's functionally
   equivalent to using the safe call operator.
   `println(b!!.length)`: The not-null assertion operator (`!!`) forcibly
   converts `b` to a non-nullable type, asserting that `b` is not `null`. If `b`
   were `null`, this line would throw a `NullPointerException` at runtime.
   This is why it's considered risky or "DANGEROUS."

Summary and Best Practices

Safe Calls (`?.`): These are preferable when you want to handle nullable objects safely.
They prevent runtime exceptions by returning `null` if the object is `null`.
Not-null Assertion (`!!`): This should be used sparingly as it can cause your
program to crash if the variable is `null`. It's best used when you are absolutely
sure that a variable will not be `null` at the point of usage, or when a `null`
value would indicate a programming error or an unexpected condition.

By using these features, Kotlin helps developers avoid common pitfalls associated
with `null`, promoting safer, more readable, and robust code.
*/