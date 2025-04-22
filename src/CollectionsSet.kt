fun main() {
    val numbers1 = setOf(1, 12, 15, 17, 25)
    println("Number of elements: ${numbers1.size}")
    if (numbers1.contains(1)) println("1 is in the set")
    // https://kotlinlang.org/docs/collections-overview.html#set

    println(numbers1) // [1, 12, 15, 17, 25]
    // LinkedHashSet is the default implementation, and it preserves order
    println()

    val numbers2 = mutableSetOf(1, 12, 15, 17, 25)
    numbers2.add(5) // added to the last position
    numbers2.add(15) // does not add it (it would be a duplicate)
    println(numbers2) // [1, 12, 15, 17, 25, 5]
    println()

    // HashSet does not preserve order
    val numbers3 = hashSetOf(1, 12, 15, 17, 25)
    println(numbers3) // [1, 17, 25, 12, 15] - different order!
    numbers3.add(25) // is not added
    numbers3.add(5) // MIGHT NOT be added at the last position, it is not predictable
    println(numbers3) // [1, 17, 25, 12, 5, 15]
}


/*
Kotlin code provides a great demonstration of different behaviors and properties of sets in Kotlin,
including immutable sets, mutable sets, and the differences between `LinkedHashSet` and `HashSet`.
Here’s a detailed explanation of what happens at each step:

Immutable Set: `numbers1`
`val numbers1 = setOf(1, 12, 15, 17, 25)`: This initializes an immutable set with specified elements.
In Kotlin, the default implementation of `setOf` is `LinkedHashSet`, which preserves the insertion
order.
`println("Number of elements: ${numbers1.size}")`: Prints the size of the set, which is 5.
`if (numbers1.contains(1)) println("1 is in the set")`: Checks if `1` is in the set and prints
a confirmation.
`println(numbers1)`: Displays the elements of the set in the order they were inserted:
`[1, 12, 15, 17, 25]`.

Output:

Number of elements: 5
1 is in the set
[1, 12, 15, 17, 25]


Mutable Set: `numbers2`
`val numbers2 = mutableSetOf(1, 12, 15, 17, 25)`: This creates a mutable set that also uses
`LinkedHashSet` by default, preserving the order of insertion.
`numbers2.add(5)`: Adds `5` to the end of the set since it's not a duplicate.
`numbers2.add(15)`: Attempts to add `15` again, but it's ignored because `15` is already
in the set.
`println(numbers2)`: Prints the updated set. The order is preserved, and `5` appears
at the end: `[1, 12, 15, 17, 25, 5]`.

Output:

[1, 12, 15, 17, 25, 5]


HashSet: `numbers3`
`val numbers3 = hashSetOf(1, 12, 15, 17, 25)`: This initializes a `HashSet`, which does not
guarantee any order. The internal arrangement depends on the hash codes of the elements.
`println(numbers3)`: The order of elements can be different from the insertion order and
might vary: `[1, 17, 25, 12, 15]` (example, actual order may vary).
`numbers3.add(25)`: This is a no-op because `25` is already present.
`numbers3.add(5)`: Adds `5` to the set. The position where `5` is inserted is not predictable
in terms of order.
`println(numbers3)`: Prints the set. The addition of `5` might affect the internal order but
does not follow a predictable insertion sequence: `[1, 17, 25, 12, 5, 15]` (example, actual
order may vary).

Output:

[1, 17, 25, 12, 15]
[1, 17, 25, 12, 5, 15]

Summary:
This code illustrates how sets function in Kotlin, highlighting their properties regarding mutability,
order preservation, and handling of duplicates. It underscores the distinction between `LinkedHashSet`
and `HashSet` concerning order preservation, which is crucial for tasks where the order of elements
matters.
*/