/*
    Map:
    
        - Kotlin map is a collection that contains pairs of objects.
        - Map holds the data in the form of pairs which consists of a key and a value.
        - Map keys are unique and the map holds only one value for each key. 
 */



fun main() {

    // with list
    
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val transformedNums = nums.map { it * 2 }
    println(transformedNums)

    val listOfNumbers = nums.mapIndexed { index, it -> it * index }
    println(listOfNumbers)
    
    
    // with map
    
    
}