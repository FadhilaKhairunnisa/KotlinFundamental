fun main() {
    println(factorial(4))

}

fun factorial(n : Int) : Int {
    return if (n == 1) {
        n
    } else{
        var result = 1
        for ( i in 1..n){
            result *= i
            
        }
        result

    }
}