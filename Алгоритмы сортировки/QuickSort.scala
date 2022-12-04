import scala.util.Random

object QuickSort:
	val randomArray: Array[Int] = (for(i <- 1 to 100000) yield Random.nextInt(10000)).toArray
	def quickSort(inputArr: Array[Int]): Array[Int] =
		val pivot = inputArr(inputArr.length / 2)
		inputArr match
			//case inputArr.length   => inputArr
			case inputArr => quickSort(tail.filter(_ < pivot)) ::: pivot :: quickSort(tail.filter(_ >= pivot))

