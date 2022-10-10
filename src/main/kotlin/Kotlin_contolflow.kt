fun main(){

    val timeOpen = 7
    val timeClose = 12
    val timeNow = 9

    val classStatus = if (timeNow >= timeClose ){
        "class already close"
    } else if (timeNow >= timeOpen){
        "class is open"
    } else {
        "class is not open yet"
    }

    println(classStatus)
}