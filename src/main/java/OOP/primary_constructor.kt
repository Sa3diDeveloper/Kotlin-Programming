package OOP

class Saadi{
    var age: Int=0;
    var name:String="";

}

fun main(){
Person(name="saadi", age =23)


}


//A primary constructor in Kotlin is a special member function that is called when an object is instantiated (created). It is used to initialize the class properties.

class Person(val name: String, val age: Int) {
    init {
        println("Person created with name $name and age $age")
    }
}