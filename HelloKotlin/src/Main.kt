// Kotlin is a static language so I have to explicitly mention the type of variable
// ( which means clearly state type of variable leaving no room for confusion)
// And before running the program the compiler checks if the mentioned variable can perform the operation or not
// Type is associated with variables and not with values


// My first Kotlin program to run Hello World
// Two types of variables : mutable and immutable
// If a is mutable variable, then I can first give it value like "" or "This is a". Later in program
// I can change to "This is changes value". But in immutable, once the value is given, then later I cannot change it.
// Once set then its done

// Function starts at main function. Based on where the variable is initially declared, mutable and immutable variable
// can have different name. Local variable and top-level variable.
// If inside a function and its {}, it is local variable of that function
// if its outside the function then its top-level variable to it.

var greeting : String = "Hello World";
const val message : String =  "I am writing Kotlin program";


fun main(){
    println(greeting)
    println(message)

    greeting = "I changed my greetings now, Hello Kotlin."
    println(greeting)
}





