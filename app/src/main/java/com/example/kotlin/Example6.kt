package com.example.kotlin

fun main(){

    1..10 == IntRange(1,10)
    for(i in IntRange(1,10)){
        print(i)
        print(". ")
    }
    println()
    //끝 숫자 포함 X
    for(i in 1 until 10){
        print(i)
        print(". ")
    }
    println()

    for(i in 1..10){
        print(i)
        print(". ")
    }
    println()

    //스텝은 양수
    for(i in 1..10 step(2)){
        print(i)
        print(". ")
    }
    println()

    //작아지게
    for(i in 10 downTo 1){
        print(i)
        print(". ")
    }
    println()

    for(i in 10 downTo 1 step(2)){
        print(i)
        print(". ")
    }
    println()

    var c = 0
    while(c<11){
        print(c)
        print(". ")
        c++
    }

}