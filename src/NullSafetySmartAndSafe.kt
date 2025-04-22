fun main() {
    // smart cast
    val string: String? = "Kotlin"
    if (string != null && string.isNotEmpty()) {
        println("String of length ${string.length}") // b is smart-casted to String type (without ?)
    } else {
        println("Null or empty string")
    }
    // https://kotlinlang.org/docs/null-safety.html#safe-calls


    // safe calls
    // this is an overkill but to demonstrate...
    val null3 = Null3(Null2(Null1("hello")))

    // null3.n3.n2.n1.length // not possible, must be checked
    val result = null3.n3?.n2?.n1?.length ?: -1 // if any is null then return -1
    println(result)
}

// ignore the concept of data classes for now
// consider them a normal class without any body
data class Null1(val n1: String?)
data class Null2(val n2: Null1?)
data class Null3(val n3: Null2?)


/*
Kotlin code demonstrates two powerful features of Kotlin's null safety system:
smart casting and safe calls. Both features help to manage nullability in Kotlin,
making your code more robust and avoiding runtime exceptions such as
`NullPointerException`. Let’s discuss each part in detail:

Smart Cast

val string: String? = "Kotlin"
if (string != null && string.isNotEmpty()) {
    println("String of length ${string.length}") // `string` is smart-casted to `String`
} else {
    println("Null or empty string")
}

Description: You have a nullable `String` variable `string`. In the `if` statement,
you first check if `string` is not `null` and is not empty using the `isNotEmpty()` method.
Smart Cast: Kotlin's smart cast feature automatically casts `string` from `String?`
to `String` inside the `if` block. This is possible because you've already checked
for `null`, ensuring that any operations within the block are safe and won't lead to
a `NullPointerException`.
Output: Since `string` is initialized with `"Kotlin"`, which is neither `null` nor
empty, the `println` inside the `if` block executes, displaying "String of length 6".

Safe Calls

val null3 = Null3(Null2(Null1("hello")))

// val result = null3.n3?.n2?.n1?.length ?: -1 // if any is null then return -1
println(result)

Classes Definition: You defined a chain of nested classes (`Null3`, `Null2`, `Null1`)
where each class wraps another class that could be nullable.
Safe Calls: `?.` operator is used to safely navigate through potentially null references
in the object chain (`null3.n3?.n2?.n1`). This ensures that if any property in the chain
is `null`, the entire expression evaluates to `null` rather than throwing an exception.
Elvis Operator (`?:`): It is used right after the chain of safe calls to provide a default
value (`-1`) if the result of the preceding safe calls is `null`.
Output: Since none of the properties in the object chain are `null`, `result` would be
the length of the string `"hello"`, which is `5`.

Summary of Expected Outputs

Given the values in your provided code:
Smart Cast Output: "String of length 6"
Safe Calls Output: "5"

These features exemplify Kotlin's approach to enhancing code safety and readability.
Smart casts reduce the need for explicit and often redundant type checks and casts.
Safe calls, combined with the Elvis operator, allow you to handle nested nullable
properties succinctly and clearly, avoiding the verbose and error-prone null checks
commonly seen in languages like Java.
*/