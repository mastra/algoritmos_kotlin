fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    //println("Mininum Sliding Window:")
    //println( Solution76().minWindow("ADOBECODEBANC","ABC"))

    println("Sort Colors:")
    val arr = IntArray(5)
    arr[0]=2
    arr[1]=0
    arr[2]=1
    arr[3]=2
    arr[4]=1
    //println( Solution75().sortColors( arr))
    println( Solution75().dutchNationalFlag( arr))

}