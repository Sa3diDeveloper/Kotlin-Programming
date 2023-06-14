package OOP

class Person3(val name: String) {

    constructor(name: String, age: Int) : this(name) {
        // This code is executed after the primary constructor is called.
        println("The person's age is $age")
    }
}


fun main(){var ob=Person3("Saadi",25)
    println(ob.name)
}