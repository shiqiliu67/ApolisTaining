package com.example.javatraining_day3

fun main(){
    var firstName: String?=null
    var lastName:String? ="Smith"

    if(firstName != null){
        println(firstName.length)
    }else{
        println(-1)}

    var length1:Int = if(firstName!= null) firstName.length else -1
    println(length1)

    var len1:Int = firstName?.length?:-1
    //(firstName?.length)is the first exe,firstname wheter equal null and if not equal null go next get length
    //(firstName?.length)?:(-1) is the second opator. length wheter equal null and if not equal null return val
    // if equal null return -1
    println(len1)
}