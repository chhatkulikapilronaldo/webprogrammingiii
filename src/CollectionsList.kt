fun main() {
    val numbers1 = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers1.size}")
    println("Third element: ${numbers1.get(2)}")
    println("Fourth element: ${numbers1[3]}")
    println("Index of element \"two\" is ${numbers1.indexOf("two")}")
//    numbers1.add("five") // cannot add elements, the list is immutable
//    numbers1[0] = "zero" // cannot change any element
    println()

    val numbers2 = mutableListOf(1, 2, 3, 4)
    println(numbers2) // [1, 2, 3, 4]
    numbers2.add(5)
    println(numbers2) // [1, 2, 3, 4, 5]
    numbers2.removeAt(1)
    println(numbers2) // [1, 3, 4, 5]
    numbers2[0] = 0
    println(numbers2) // [0, 3, 4, 5]
    // https://kotlinlang.org/docs/collections-overview.html#list
}



/*
Your Kotlin code showcases the difference between immutable and mutable lists, illustrating basic operations on each type. Here’s what each part of your code does and what it demonstrates about Kotlin lists:

Immutable List: `numbers1`

1. Initialization:
   `val numbers1 = listOf("one", "two", "three", "four")`: Creates an immutable list containing string elements.

2. Accessing List Properties and Elements:
   `println("Number of elements: ${numbers1.size}")`: Prints the size of the list, which is 4.
   `println("Third element: ${numbers1.get(2)}")`: Accesses the third element (index 2) using the `get` method. It's `"three"`.
   `println("Fourth element: ${numbers1[3]}")`: Accesses the fourth element (index 3) directly using square brackets, which is `"four"`.
   `println("Index of element \"two\" is ${numbers1.indexOf("two")}")`: Finds and prints the index of the element `"two"`, which is 1.

3. Immutable Nature:
   Commented-out lines `// numbers1.add("five")` and `// numbers1[0] = "zero"` illustrate attempts to modify the list, which are not allowed because the list is immutable. If uncommented, these lines would cause compile-time errors.

Expected Output for `numbers1`:

Number of elements: 4
Third element: three
Fourth element: four
Index of element "two" is 1


Mutable List: `numbers2`

1. Initialization:
   `val numbers2 = mutableListOf(1, 2, 3, 4)`: Creates a mutable list of integers.

2. Modifying and Printing the List:
   `println(numbers2)`: Initially prints the list as `[1, 2, 3, 4]`.
   `numbers2.add(5)`: Adds the element `5` to the end of the list.
   `println(numbers2)`: Prints the list after adding `5`, which is `[1, 2, 3, 4, 5]`.
   `numbers2.removeAt(1)`: Removes the element at index 1 (the `2`), modifying the list.
   `println(numbers2)`: Prints the list after removing `2`, which is `[1, 3, 4, 5]`.
   `numbers2[0] = 0`: Changes the element at index 0 from `1` to `0`.
   `println(numbers2)`: Prints the list after modifying the first element, which is `[0, 3, 4, 5]`.

Expected Output for `numbers2`:

[1, 2, 3, 4]
[1, 2, 3, 4, 5]
[1, 3, 4, 5]
[0, 3, 4, 5]

Summary
This example effectively demonstrates how immutable lists restrict modifications, ensuring data integrity, while mutable lists provide flexibility to add, remove, or change elements. It's a good illustration of using Kotlin’s list capabilities in scenarios where list mutability or immutability is a key consideration.
*/