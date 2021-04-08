package com.example.javatraining_day3

fun main(){
    var name : String?=""
    if (name != null) {
        println(name.length)
    }
    var obj:Any ="Hello"
    if(obj !is String){

    }else{
        println(obj.length)
    }
    if(obj is String){
        println(obj.length)
    }
}