package moreOfKotlin

fun main(){
    val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
    val num1 = arrayOf<Int>(1, 2, 3) //explicit type declaration
    print(num1[1])
}