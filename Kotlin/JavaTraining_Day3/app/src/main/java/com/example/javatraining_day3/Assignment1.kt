package com.example.javatraining_day3
fun findMax(num1:Int,num2:Int,num3:Int){
    var max :Int? = num1
    var numbers = arrayOf(num1,num2,num3)
    //compare
    for(number in numbers){
        if (max != null) {
            if(max < number) {
                max=number
               }
        }
    }
    println("Max number : $max")
}

fun printList(array:ArrayList<Int>){
    for(element in array){
        print("$element \t")
    }
}

fun main(){
println("===============Q1===============")
    println("Enter three numbers: ")
    var num1 = Integer.valueOf(readLine())
    var num2 = Integer.valueOf(readLine())
    var num3 = Integer.valueOf(readLine())
    findMax(num1, num2, num3)
println("===============Q2===============")
    println("Enter data: ")
    val arrl:ArrayList<Int> = ArrayList<Int>()
//    val members = mutableListOf<Int>()
    arrl.add(readLine()!!.toInt())
    println("Do you want add more data? No-0 Yes-1")
    var choose = readLine()!!.toInt()
   // var choose : Int = Integer.valueOf(readLine()
    while(choose == 1){
       //want to add more
            println("Enter data : ")
           //arrl.add(Integer.valueOf(readLine())
            arrl.add(readLine()!!.toInt())
            println("Do you want add more data? No-0 Yes-1")
            choose = readLine()!!.toInt()
    }
    println("This is the list of data: ")
    printList(arrl)

println("\n===============End===============")

}



