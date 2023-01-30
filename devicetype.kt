fun main() {
    val device: Boolean? = true  //set this to either true or false depending on ios or android device user
    if (device == true) {
        print("I have an iOS device")
    }
    if (device == false) {
        print("I have an Android device")
    }
}