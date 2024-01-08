package com.example.kotlin

fun main(){
    max(10,3)
    isHoliday("금")
}

fun max(a: Int, b: Int){
    //기존 자바에서의 방식
    if(a>b){
        println(a)
    }else{
        println(b)
    }
    // 코틀린에서의 조건식
    val result = if(a>b){
        a
    }else{
        b
    }
    // 코틀린은 삼항연산자가 없는 대신 {}를 생략하여 아래와 같이 간략하게 표기 가능
    val result2 = if (a>b) a else b
    println(result)
}

//월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: String){
    //조건문이 아닌 식으로 쓸 경우 예외처리를 위해 else사용해야한다.
    var result = when(dayOfWeek){
        "토",
        "일" -> true
        else -> false
    }

    println(result)


}