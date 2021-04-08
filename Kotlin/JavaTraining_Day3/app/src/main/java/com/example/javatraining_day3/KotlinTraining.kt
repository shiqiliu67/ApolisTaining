package com.example.javatraining_day3

fun main(){
    //type conversion
    var value1 =10
    var value2= 20
    var value3:Short =value1.toShort()
    println("after to short, value is $value3")
    var value4:Long = value2.toLong()
    println(value4)
    //kotlin we can if-else like an expression
    var num1=10
    var num2=20
    var result = if(num1>num2)"$num1 is greater than $num2"
                else "$num2 is greater than $num1"
    println(result)

    //another
    var num3=1
    var result1=if(num3>0)"$num3 greater than 0"
                else if(num3<0)"$num3 less than 0"
                else "$num3 is equal to 0"
    println(result1)
}