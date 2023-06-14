package Function

fun main(){

    returnFun(n = 2)
}
fun expressionsFun(){
 for(i in 1..100){
     if(i%2==1){
         println(i)
     }
 }

}


fun returnFun(n: Int): String {
    if (n ==2) {
        return "Even"
    } else {
        return "Odd"
    }
}