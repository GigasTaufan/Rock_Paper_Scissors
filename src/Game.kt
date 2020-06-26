fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}


fun getGameChoice(optionsParam:Array<String>): String {
    var result = optionsParam[(Math.random()*optionsParam.size).toInt()]
    return result
}

fun getUserChoice(optionsParam: Array<String>):String{
    var isValidChoice = false
    var userChoice = ""
    // Loop until the user enters a valid choice
    while (!isValidChoice){
        // Ask the user for their choice
        println("Please enter one of the following: ")
        for (item in optionsParam){
            println(" $item")
        }
        print("Your Choice: ")
        // Read the user input
        val userInput = readLine()
        // Validate the user input
        if (userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        // If the choice is valid, inform the user
        if (!isValidChoice) {
            print("You must enter a valid choice!")
        }
    }
    return  userChoice
}

fun printResult(userChoice:String, gameChoice: String){
    val result: String
    // Figure out the result
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice=="Rock" && gameChoice=="Scissors")||
            (userChoice=="Paper" && gameChoice=="Rock") ||
            (userChoice=="Scissors" && gameChoice=="Paper")) result = "You Win!"
    else result = "You Lose!"
    // Print the result
    println("You choose $userChoice and the computer choose $gameChoice." )
    println("$result")
}
