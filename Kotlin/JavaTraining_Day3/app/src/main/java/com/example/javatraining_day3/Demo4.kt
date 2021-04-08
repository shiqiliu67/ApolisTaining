fun main(){

    // when without expression
    var number = 4
    when(number){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Invalid number")
    }

    // when with expression
    var number2 = 1
    var result = when(number2){
        1 -> "one"
        2 -> "two"
        else -> "invalid number"
    }
    println(result)

    // when with multiple statements
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

    // when with multiple branches
    var number4 = 1
    when(number4){
        1,3,5,7,9 -> {
            println("Odd number")
        }
        2,4,6,8 -> {
            println("Even numbers")
        }
    }

    // when with range
    var number5 = 2
    when(number5){
        in 1..5 -> println("number is between 1-5")
        in 6..10 -> println("number is between 6-10")
    }

}