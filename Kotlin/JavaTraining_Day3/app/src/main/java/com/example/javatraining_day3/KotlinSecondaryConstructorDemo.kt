package com.example.javatraining_day3

class Test2{
    constructor(id:Int){
        println("First Secondary Constructor: $id")
    }
    constructor(name:String){
        println("Second Secondary Constructor: $name")
    }
}
class Customer(var name:String){
    constructor(id:Int, name:String):this(name){
        println("Customer ID: $id")
        println("Customer Name: $name")
    }
}
fun main(){
    var customer =Customer(1,"Alice")
    var customer1=Customer("Bob")
}