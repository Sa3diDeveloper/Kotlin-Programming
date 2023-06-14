package OOP

class Person1(val name: String) {
    var age: Int = 0
     var city: String ="akre"
    init {
        age = 25
    }

    init {
        if(city=="akre"){
            println("welcome ")
        }
    }
}

fun main(){
    var ob=Person1(name = "saadi")
  println(  ob.age)
    println(  ob.city)
}