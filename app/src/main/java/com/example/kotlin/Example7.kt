package com.example.kotlin

fun main(){
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    //Listof로 변경이 불가능함 호출만 가능하다
    val list1 = listOf(1,2,3,4)
    list1[0]
    //list1.add

    println(list1.map{it * 10}.joinToString("/"))

    val diverseList = listOf(1, "he", 1.78, true)


    println(list.joinToString(","))

    val map = mapOf((1 to "안녕"), (2 to "hello"))
    //map.put

    val map1 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map1.put(3, "응")
    map1[4] = "yes"
    map1[5] = "hi"



}