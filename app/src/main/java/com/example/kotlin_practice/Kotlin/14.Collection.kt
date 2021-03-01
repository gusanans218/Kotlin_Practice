package com.example.kotlin_practice.Kotlin

//14. Collection

// -> list, set, map

// List

fun main(args:Array<String>) {

    //List -> 중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    val a = numberList.get(0)
    println(numberList.get(0))

    //Set
    // -> 중복을 허용하지 않는다
    // -> 순서가 없다!!!
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach{
        println(it)
    }
    println(numberSet)

    //Map -> Key, value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    //Mutable Collaction(변경 가능)
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberSet = mutableMapOf<String, Int>("one", to 1)
    mNumberSet.put("two", 2)
    println(mNumberSet)
}


