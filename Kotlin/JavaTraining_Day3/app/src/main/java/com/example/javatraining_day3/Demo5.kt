fun main(){

//    for(int i=0;i<5;i++){
//        //body
//    }

    println("name: ")
    var names = arrayOf("Mark", "Smith", "John")
    for(name in names){
        println(name)
    }

    println("numbers: ")
    var numbers = arrayOf(10,20,30,40)
    for(number in numbers){
        println(number)
    }

    println("range 1-5")
    for (i in 1..5){
        println(i)
    }

    println("range 5-1")
    for (i in 5 downTo 1){
        println(i)
    }

    println("range down 2")
    for(i in 10 downTo 2){
        println(i)
    }


    for(i in 1..10 step 2){
        println(i)
    }

    for (i in 5 downTo 1 step 2){
        println(i)
    }


}