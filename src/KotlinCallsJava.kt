class KotlinCallsJava {

    fun printString(string: String) {
        println("Printing in Kotlin class")
        println(string)
    }

    fun callingJava() {
        val javaCallsKotlin = JavaCallsKotlin()
        javaCallsKotlin.printString("Hello from Kotlin code!")
    }

}

fun main() {
     KotlinCallsJava().callingJava()
}

/*
Kotlin code defines a class `KotlinCallsJava` which, as its name suggests, is designed to
interact with a Java class `JavaCallsKotlin`. This setup shows how Kotlin can easily call
Java code, taking advantage of Kotlin’s seamless interoperability with Java. Here’s a
detailed breakdown of each part:

Kotlin Class: `KotlinCallsJava`

1. Method `printString(String)`:
This method simply prints a message to the console indicating that it is printing
from within the Kotlin class, followed by the actual string passed to it. This
demonstrates Kotlin's straightforward syntax for defining functions and handling
string output.

2. Method `callingJava()`:
Inside this method, an instance of the Java class `JavaCallsKotlin` is created. This instantiation looks just like any Kotlin class instantiation, highlighting Kotlin's interoperability.
`printString` method of the `JavaCallsKotlin` instance is then called with the argument `"Hello from Kotlin code!"`. This line demonstrates calling a Java method from Kotlin seamlessly.

Main Function

Execution: The `main` function is the entry point of the Kotlin program. It creates an instance of `KotlinCallsJava` and calls the `callingJava()` method. This initiates the interaction with the Java class, executing the cross-language method invocation.

Java Class: `JavaCallsKotlin`

Given the usage pattern in your Kotlin code, the Java class `JavaCallsKotlin` would look something like this:

public class JavaCallsKotlin {

    public void printString(String string) {
        System.out.println("Printing in Java class");
        System.out.println(string);
    }

    public static void main(String[] args) {
        new JavaCallsKotlin().printString("Test from Java main");
    }
}

Method `printString(String string)`: This method in the Java class handles printing to
the console, similar to its Kotlin counterpart but using Java syntax.

Execution and Interactions:

When you run the Kotlin `main` function:
Output of `callingJava()` in Kotlin**: It triggers the print operations in the Java class,
effectively printing:

  Printing in Java class
  Hello from Kotlin code!

This process illustrates a typical use-case where Kotlin and Java code coexist in the same
project, often seen in Android development or in transitioning legacy Java applications to Kotlin.

Conclusion:

This example is a perfect demonstration of how Kotlin and Java can interact within the
same application environment. The ability to use Kotlin's concise syntax and powerful
features alongside existing Java code without rewriting the entire codebase is a significant
advantage for many developers.
 */