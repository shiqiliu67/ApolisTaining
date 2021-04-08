package com.example.javatraining_day3

//class KotlinTraining_Day1 {
//}
fun main(){
    println("hello world!")
    var a=10
    println(a)
    a=20
    println(a)

    val b =30
   // b=40 error: val cannot be change

   //int c=10 error  only have val or var two
    //following var var_name :Type = value & var var_name = value both ok.
    var c1 : Int = 10
    var c =10
    println("C is $c \nC1 is $c1")
    var s1 : String = "Alice"
    var s ="Alice"
    println("S is $s \nS1 is $s1")
    val d:Double = 12.34
    println(d)

    var x =10
    var y =20
    println("X = "+x+", Y = "+y)
    println("X = $x, Y= $y")
    println("${x+y}")
    println("x=$x,y=$y, x+y=${x+y}")

}