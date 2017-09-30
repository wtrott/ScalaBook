import java.math.BigInteger

val big = new BigInteger("12345")

// This is the wrong way to initialize array
val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for(i <- 0 to 2)
  print(greetStrings(i))

// Better way of initializing an array
val numNames = Array("zero", "one", "two")

// Create a list. Lists in Scala are immutable
// All data in list must be of same data type
val oneTwoThree = List(1, 2, 3)

// List concatenation(:::)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

// Cons(::) prepends elements
val twoThree = List(2, 3)
val oneTwoThreeNew = 1 :: twoThree
println(oneTwoThreeNew)

// Nil to put together new lists
val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil

// List Methods
val thrill = "Will" :: "fill" :: "until" :: Nil // Cons
List("a", "b") ::: List("c", "d") // Concatenation
thrill(2) // Item selection
thrill.count(s => s == "until") // Scan thrill, return index of "until"
thrill.filter(s => s.length == 4) // Return all elements of length 4
thrill.forall(s => s.endsWith("l")) // Apply function to all elements of thrill
thrill.foreach(s => print(s)) // Do this for every element of thrill
thrill.foreach(print) // Same as previous
thrill.head // Return first element
thrill.init // Return all but last element
thrill.isEmpty // Is the list empty
thrill.last // Return last element
thrill.length // Return length of string
thrill.map(s => s + "y") // Apply the function to all elements of thrill
thrill.mkString(", ") // Convert thrill from list to string
thrill.filterNot(s => s.length == 4) // Removes elements that don't satisfy the condition
thrill.reverse // Reverse the elements of thrill
//thrill.sort((s, t) => s.charAt(0).toLower < t.charAt(0).toLower) // Sorts list based on lowercase first letter
thrill.tail // Removes first element from thrill

// Tuples
// Like a list, but can contain elements of different types
val pair = (99, "Luftballoons")
println(pair._1)
println(pair._2)

// Sets and maps
// Sets act like finite sets in math, used to check if a value is in it or not

// This creates an immutable set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// This creates a mutable set
import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)