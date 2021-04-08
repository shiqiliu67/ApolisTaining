package com.example.javatraining_day3
fun main(){
    //when without expression
    var number = 3
    when(number){
        1 -> println("number is 1")
        2 -> println("number is 2")
        3 -> println("number is 3")
    }
    //when with expression
    var number1 = 3
    var result=when(number1){
        1 -> "number is 1"
        2 -> "number is 2"
        else -> "other number"
    }
    println(result)

    //when with multi statements
    var number3 = 1
    when(number3){
        1 -> {
            println("One")
            println("_____")
        }
        2 -> {
            println("Two")
            println("_____")
        }
        3 -> {
            println("Three")
            println("_____")
        }
    }
    //when with multi branches
    var number4 =4
    when(number4){
        1,3,5,7->{
            println("odd number")}
        2,4,6,8->{
            println("even number")}
    }

    //when with range
    var number5 = 8
    when(number5) {
        in 1..5 -> {
            println("in range 1-5")
        }

        in 6..10 -> {
            println("in range 6-10")
        }
    }
}

