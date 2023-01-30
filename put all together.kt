fun main(args: Array<String>) {
    names().printname()
    names().printage()
print(" I currently study at University of Charleston, and " )
    devicetype().device()
    print("Today is ")
    dayofweek().day()
    println(" and i enjoy: ")
    arraylist().stuff()
}
class names() {
   fun printname() {
       val name = "Matthew Mills"
           print("Hi! my name is, $name! ")

   }
    fun printage() {
        val age = "22"
            print("And i am $age years old.")
    }
}

class devicetype(){
    fun device() {
        val device: Boolean? = true //set this to either true or false depending on ios or android device user
        if (device == true) {
            println("I have an iOS device. ")
        }
        if (device == false) {
            println("I have an Android device. ")
        }
    }
}
class dayofweek(){
    fun day() {
        val number = "5"
        when(number) {
            "1" -> print("Sunday")
            "2" -> print("Monday")
            "3" -> print("Tuesday")
            "4" -> print("Wednesday")
            "5" -> print("Thursday")
            "6" -> print("Friday")
            "7" -> print("Saturday")
            else -> print("this is not a valid number please try again")
        }
    }
}
class arraylist(){
    fun stuff() {
        val randomthings = arrayOf("Baseball", "Golf",
                "Fishing", "Watching Youtube", "Car Detailing")
        for (i in 0..randomthings.size-1) {
            println(randomthings[i])
        }
    }
}
