fun main () {
printOdd()
 println( getName(arrayOf("Susan","Nakimuli","Mary","Busingye","Elisha")))
    serve(6)
    serve(12)
    serve(17)
    serve(2)
    printNumbers()
}
fun printOdd () {
    for(num in 1..100){
        if(num%2!=0) {
            println(num)
        }
    }
}
fun getName (name:Array<String>):Int {
    var num = 0
    name.forEach { n ->
        if (n.length>5){
            num++
        }
    }
    return num
}
fun serve (age:Int) {
    if (age<=6) {
        println("Serve a glass of milk")
    }
    else if (age>6 && age<15) {
        println("Serve bottle of fanta Orange")
    }
    else {
        println("Serve a bottle of cococola")
    }
}
fun printNumbers () {
    for(numbers in 1..100){
        if(numbers%3==0&& numbers%5==0) {
            println("FizzBuzz")
        }

        else if(numbers%3==0) {
            println("Fizz")
        }
        else if(numbers%5==0) {
            println("Buzz")
        }

        else {
            println(numbers)
        }
    }
}

