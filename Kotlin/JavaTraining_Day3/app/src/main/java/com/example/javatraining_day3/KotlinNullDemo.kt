package com.example.javatraining_day3

fun main(){
   // var str:String = null//Null can not be a value of a non-null type String-compile error
    var str3:String=""
    var str4:String?
    str4= null
    var str5:String?=null
    var name:String?="Mark Smith"
    if (name != null) {
        println("name is $name "+name.length)
    }
    var obj:Any?=null
//    var str:String=obj as String
    // println(str)//kotlin.TypeCastException: null cannot be cast to non-null type kotlin.String

    var obj2:Any=123
//    var str2:String=obj2 as String
   // println(str2)//TypeCastException

    var obj4:String?="Hello World"
    var str6:String?=obj4 as String?
    println(str6)

    //safe casting
    var obj5:Any="Hello"
    var str8:String?=obj5 as?String
    var str9:Int?=obj5 as?Int
    println(str8)
    println(str9)

}