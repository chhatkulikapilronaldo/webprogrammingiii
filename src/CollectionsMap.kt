fun main() {
    val numbersMap1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println(numbersMap1) // {key1=1, key2=2, key3=3, key4=1}

    println("All keys: ${numbersMap1.keys}") // All keys: [key1, key2, key3, key4]
    println("All values: ${numbersMap1.values}") // All values: [1, 2, 3, 1]
    if ("key2" in numbersMap1) println("Value by key \"key2\": ${numbersMap1["key2"]}")
    if (1 in numbersMap1.values) println("The value 1 is in the map")
    if (numbersMap1.containsValue(1)) println("The value 1 is in the map") // same as previous

    val numbersMap2 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap2.put("three", 3) // numbersMap2["three"] = 3
    numbersMap2["one"] = 11
    println(numbersMap2) // {one=11, two=2, three=3}

    // https://kotlinlang.org/docs/collections-overview.html#map
}


/*
Kotlin code provides a clear demonstration of how to work with immutable and mutable maps in Kotlin. Let's analyze what your code does and what outputs it generates.

Immutable Map: `numbersMap1`

1. Initialization:
   `val numbersMap1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)`: This creates an immutable map where each key is associated with a value. Note that the key "key4" shares the same value `1` as "key1", which is perfectly valid as values can be duplicated, but keys cannot.

2. Printing the Map:
   `println(numbersMap1)`: Outputs the whole map. The order of the keys in the output reflects their insertion order, which is consistent for immutable maps in Kotlin: `{key1=1, key2=2, key3=3, key4=1}`.

3. Accessing Map Elements:
  Keys: `println("All keys: ${numbersMap1.keys}")`: Prints all keys in the map: `[key1, key2, key3, key4]`.
  Values: `println("All values: ${numbersMap1.values}")`: Prints all values: `[1, 2, 3, 1]`. Notice the duplication of the value `1`.
  Specific Key: Checks if "key2" is present in the map and prints its value: `"Value by key \"key2\": ${numbersMap1["key2"]}"`, which will output `2`.
  Value Check: Checks if the value `1` is in the map and prints a confirmation twice, once using `in` operator and once using `containsValue`.

Expected Output for `numbersMap1`:

{key1=1, key2=2, key3=3, key4=1}
All keys: [key1, key2, key3, key4]
All values: [1, 2, 3, 1]
Value by key "key2": 2
The value 1 is in the map
The value 1 is in the map


Mutable Map: `numbersMap2`

1. Initialization:
   `val numbersMap2 = mutableMapOf("one" to 1, "two" to 2)`: Creates a mutable map, initially with two key-value pairs.

2. Modifying the Map:
   `numbersMap2.put("three", 3)`: Adds a new key-value pair ("three" to 3).
   `numbersMap2["one"] = 11`: Updates the value associated with the key "one" from `1` to `11`.

3. Printing the Updated Map:
   `println(numbersMap2)`: Outputs the current state of the map showing all modifications: `{one=11, two=2, three=3}`.

Expected Output for `numbersMap2`:

{one=11, two=2, three=3}


Summary
Your code effectively shows how to interact with both immutable and mutable maps in Kotlin, including basic operations such as initialization, value updates, key-value retrieval, and conditionally checking for the presence of keys and values. This example also illustrates the flexibility of Kotlin maps and the difference between mutable and immutable collections, an essential concept in Kotlin programming.
*/