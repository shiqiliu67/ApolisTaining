package com.example.javatraining_day3

fun main(){
    //loop
    println("name:")
   var names = arrayOf("Mark","Smith","Alice")
    for(name in names){
        print("$name \t")
    }
println("\nnumber:")
    var numbers = arrayOf(10,20,30,40,50)
    for(numer in numbers){
        print("$numer ")
    }
println("range 1-5")
    for(i in 1..5){
        print("$i ")
    }
    println("range 5-1")
    for(i in 5 downTo 1){
        print("$i ")
    }
    println("range 5-2")
    for(i in 10 downTo 2){
        print("$i ")
    }
    println("range 5-2")
    for(i in 1..10 step 2){
        print("$i ")
    }
    for(i in 5 downTo 1 step 2 ){
        print("$i ")
    }
}