import scala.language.postfixOps
import scala.util.Random

val randomArray: Array[Int] = (for(_ <- 1 to 1000) yield Random.nextInt(1000)).toArray
	def quickSort(inputArray: Array[Int]): Array[Int] =
		inputArray.length match
			case 0 => inputArray
			case 1 => inputArray
			case _ => Array.concat(
				quickSort(inputArray.filter(inputArray(inputArray.length / 2) >)),
				inputArray.filter(inputArray(inputArray.length / 2) ==),
				quickSort(inputArray.filter(inputArray(inputArray.length / 2) <)))

	print(quickSort(randomArray).mkString("Sorted array: (", ", ", ")"))
