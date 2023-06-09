package Function

fun main(){
    getInt(a = 1, b = 1.2,c=1.1)
}

fun getInt(b:Int ,a: Int){
    print(a+b)
}

fun getInt(b:Double ,a: Int){
    print(a+b)
}

fun getInt(b:Double ,a: Int, c:Double){
    print(a+b+c)
}