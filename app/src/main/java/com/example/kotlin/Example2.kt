package com.example.kotlin


fun main() {
    val result = test(1, c = 5)
    test2(name = "somsomco", id ="som", nickname = "som")
    println(result)
    println(time1(1,2))
    println(time2(1,2))

}

//Overloading 대신 디폴트 값
fun test(a: Int, b: Int = 3, c: Int) : Int{
    println(a+b)
   return a+b

}

fun test2(name: String, nickname: String, id: String) =  println(name + nickname + id)

fun time1(a: Int, b: Int) = a*b
fun time2(a: Int, b: Int,) : Int{
    return a * b
}

