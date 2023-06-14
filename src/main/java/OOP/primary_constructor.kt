package OOP

class Saadi{
    var age: Int=0;
    var name:String="";

}

fun main(){
Person(name="saadi", age =23)


}


class Person(val name: String, val age: Int) {
    init {
        println("Person created with name $name and age $age")
    }
}