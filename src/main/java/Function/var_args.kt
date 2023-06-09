package Function

fun main(){
varArgs1(1,12,2,2,22,3,2,2,2,2,2,2,2,2,2,22,)
}

fun varArgs(vararg num:Int): Int {
    var result=0;
    for (numbers in num){
        result+=numbers;
    }
    return result;
}

fun varArgs1(vararg num:Int) {
   num.forEach {
       print(it.toInt())
   }

}