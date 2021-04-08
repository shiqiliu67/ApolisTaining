package com.example.javatraining_day3

//class Employee{
//    var firstName:String =""
//    var lastName:String=""
//
//    fun getFullName(){
//        println("$firstName $lastName")
//    }
//}
//fun main(){
//    var emp = Employee()
//    emp.firstName="Alice"
//    emp.lastName="Smith"
//    emp.getFullName()
//}

//prinmary constructor with property and inti block
//class Employee(firstName:String,lastName:String){
//   private var firstName:String =""
//   private var lastName:String=""
//
//
//    init {
//        this.firstName = firstName
//        this.lastName=lastName
//    }
//    fun getFullName(){
//       println("$firstName $lastName")
//    }
//}
//fun main(){
//    var emp = Employee("Alice","Watson")
//    emp.getFullName()
//}

//primary constructor with property
class Employee(var firstName:String,var lastName:String){

    fun getFullName(){
        println("$firstName $lastName")
    }
}
fun main(){
    var emp = Employee("Alice","Watson")
    emp.getFullName()
}