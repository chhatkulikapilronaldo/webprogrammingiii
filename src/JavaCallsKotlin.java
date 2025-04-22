public class JavaCallsKotlin {

    public void printString(String string) {
        System.out.println("Printing in Java class");
        System.out.println(string);
    }

    private void callingKotlin() {
        final KotlinCallsJava kotlinCallsJava = new KotlinCallsJava();
        kotlinCallsJava.printString("Hello from Java code!");
    }

    public static void main(String[] args) {
        new JavaCallsKotlin().callingKotlin();
    }

}


/*
Java code snippet demonstrates a Java class (`JavaCallsKotlin`) that interacts with a
Kotlin class (`KotlinCallsJava`). The purpose of this interaction is to illustrate how
Java and Kotlin can seamlessly integrate within the same project, benefiting from
Kotlin's interoperability with Java. Here's a breakdown of what happens in the code
and some additional context on how Java interacts with Kotlin:

Java Class: `JavaCallsKotlin`
Method `printString(String string)`:
This is a public method that takes a string as an argument and prints it, preceded by
a fixed message. It is not directly used within the Java code provided but could
potentially be called from Kotlin or other Java classes.

Method `callingKotlin()`:
A private method used to demonstrate calling Kotlin functionality from Java.
Inside, it creates an instance of a Kotlin-defined class, presumably named `KotlinCallsJava`.
It then calls the `printString` method on this Kotlin instance, passing a message `
"Hello from Java code!"`. This showcases the ability to invoke Kotlin methods as if they
were Java methods, thanks to Kotlin's interoperability features.

`main` Method:
The entry point for the Java program, which creates an instance of `JavaCallsKotlin` and
calls the `callingKotlin()` method. This initiates the cross-language interaction.

Kotlin Class: `KotlinCallsJava`
Although the implementation of this Kotlin class isn't provided, based on your Java code,
it would typically look something like this:


class KotlinCallsJava {
    fun printString(string: String) {
        println("Printing in Kotlin class")
        println(string)
    }
}


This Kotlin class has a method `printString` that presumably does something similar to its
Java counterpart—print a string to the console. In Kotlin, methods are public by default,
which allows them to be easily accessed from Java.

How Java Calls Kotlin:
Interoperability: Kotlin is designed to be fully interoperable with Java. Kotlin code can
be called from Java in the same way Java code calls other Java code. This includes
accessing properties, calling methods, and implementing interfaces.

Kotlin Artifacts: When you compile Kotlin code, it is compiled into Java bytecode, which
runs on the Java Virtual Machine (JVM). This means Kotlin classes become part of the
same ecosystem as Java classes, packaged into `.class` files and callable from Java.

Null Safety: When calling Kotlin from Java, one should be cautious about null safety,
as Kotlin has a strict null safety mechanism that Java does not enforce.

Conclusion:
The example you provided is a straightforward demonstration of using Java to invoke Kotlin
code, reflecting the practicality and ease of mixing these two languages in a single
application. This capability is particularly useful in scenarios where old Java codebases
are incrementally migrated to Kotlin or when leveraging Kotlin's modern features in a
primarily Java project.
 */