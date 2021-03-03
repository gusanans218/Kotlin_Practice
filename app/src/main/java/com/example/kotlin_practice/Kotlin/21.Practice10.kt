package com.example.kotlin_practice.Kotlin

//3) Tv 클래스
// - on/off 기능
// - 채널을 돌리는 기능
// - 초기 채널은 (S사 M사 K사 3개)

fun main(args:Array<String>){
    val tv = TV(listOf<String>("K", "M", "S"))
   tv.switch()
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)
    tv.channelUp()
    println(tv.checkCurrentChannel())
}

class TV(val channels:List<String>){

    var onOrOff : Boolean =false //True -> On, False -> Off
    var currentChannelNumber = 0

    fun switch(){
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(){
        return channels[currentChannelNumber]
    }
    
    fun channelUp(){
        channels.forEachIndexed { index, value ->
            if(currentChannelNumber == index){
                currentChannelNumber = currentChannelNumber +1
                return
            }
        }
    }
    fun channelDown(){
        currentChannelNumber = currentChannelNumber -1
//        channels.forEachIndexed { index, value ->
////            if(currentChannelNumber == index){
////                currentChannelNumber = currentChannelNumber = 1
////                return
////            }
////        }
    }
}