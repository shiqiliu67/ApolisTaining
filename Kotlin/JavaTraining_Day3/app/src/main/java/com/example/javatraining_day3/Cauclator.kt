package com.example.javatraining_day3

class Calculator{
    var num1 :Int = 10
    var num2: Int = 0

    fun addNumber(num1:Int, num2:Int):Int{
        return num1+num2
    }
    fun subNumber(num1:Int, num2:Int):Int{
        return num1-num2
    }
}
fun main(){
    var c :Calculator = Calculator()
    c.num1=100
    c.num2=50
   println( c.addNumber(100,50))
   println( c.subNumber(100,20))



}