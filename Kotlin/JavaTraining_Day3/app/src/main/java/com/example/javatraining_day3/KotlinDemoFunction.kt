package com.example.javatraining_day3

//function without return type and parameter
fun printHello(){
    println("Hello World")
}
//function without return type parameter
fun addNumber(num1:Int, num2:Int){
    println("Total: ${num1+num2}")
}
//function with return value and with parameter
fun mulNumber(num1:Int, num2:Int):Int{
    return num1*num2
}
//function with return type and no parameter
fun printNumber(): Int {
    return 100
}
fun main(){
    printHello()
    addNumber(1,2)
  println(mulNumber(2,3))
    println(printNumber())

}