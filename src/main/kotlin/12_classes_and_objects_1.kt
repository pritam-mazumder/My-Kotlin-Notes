// Example 1:
class Bike1 {
    var name: String = ""
    var brand: String = ""
    var cc: Int = 0

    fun bikeInfo() {
        println("Name: $name")
        println("Brand: $brand")
        println("Engine: cc: $cc")
    }
}

// Example 2:
data class Bike2(val name: String, val brand: String, val cc: Int) {
    fun bikeInfo() {
        println("Name: $name")
        println("Brand: $brand")
        println("Engine cc: $cc")
    }
}

fun main() {
    // Example 1:
    val r1 = Bike1()
    r1.name = "r1"
    r1.brand = "yamaha"
    r1.cc = 998
    r1.bikeInfo()

    val s100rr = Bike1()
    s100rr.name = "s100rr"
    s100rr.brand = "bmw"
    s100rr.cc = 999
    s100rr.bikeInfo()

    // Example 2:
    val superleggera = Bike2("Superleggera V4", "Ducati", 998)
    superleggera.bikeInfo()

    val h2 = Bike2("H2", "Kawasaki", 999)
    h2.bikeInfo()
}