package com.example.kotlin

fun main(){
    var name : String = "name"
    var number : Int = 10

    var nickname : String? = null
    var secondNumber : Int? = null

    //일반적인 자바에서
    var result = if(nickname == null){
        "값이 없음"
    }else{
        nickname
    }
    println(result)

    //코틀린에서
    nickname = null
    val result1 = nickname?:"값이 없음"
    val size = nickname?.length

    println(result)
    println(size)


}