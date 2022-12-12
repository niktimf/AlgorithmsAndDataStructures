import scala.language.postfixOps
import scala.util.Random

val randomArray: Array[Int] = (for(_ <- 1 to 1000) yield Random.nextInt(1000)).toArray
	def quickSort(inputArray: Array[Int]): Array[Int] =
		val pivot = inputArray(inputArray.length / 2)
		inputArray.length match
			case 0 => inputArray
			case 1 => inputArray
			case _ => Array.concat(
				quickSort(inputArray.filter(pivot <)),
				inputArray.filter(pivot ==),
				quickSort(inputArray.filter(pivot >)))

	print(quickSort(randomArray).mkString("Array(", ", ", ")"))
