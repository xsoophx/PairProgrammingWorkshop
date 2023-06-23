import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TaskOneTest {

    private val taskOne = TaskOneSolution

    // Beispiel:
    @Test
    fun `should print hello world`() {
        assertEquals(expected = "Hallo Welt!", taskOne.printHallo())
    }

    // 1.
    @Test
    fun `should double the number`() {
        assertEquals(expected = 4, actual = taskOne.double(2))
    }

    // 2.
    @Test
    fun `should sum two numbers`() {
        assertEquals(expected = 3, actual = taskOne.sumOf(1, 2))
    }

    // 3.
    @Test
    fun `should return length of string`() {
        assertEquals(expected = 5, actual = taskOne.lengthOfString("Hallo"))
    }

    // 4.
    @Test
    fun `should test even or odd number`() {
        assertEquals(expected = true, actual = taskOne.isEven(2))
        assertEquals(expected = false, actual = taskOne.isEven(3))
    }

    // 5.
    @Test
    fun `should return name`() {
        assertEquals(expected = "Max", actual = taskOne.printName("Max"))
    }

    // 6.
    @Test
    fun `should return average of list`() {
        assertEquals(expected = 2.0, actual = taskOne.average(listOf(1, 2, 3)))
    }

    // 7.
    @Test
    fun `should return sorted list`() {
        assertEquals(expected = listOf(1, 2, 3), actual = taskOne.sort(listOf(3, 2, 1)))
    }

    // 8.
    @Test
    fun `should return true if list contains number`() {
        assertEquals(expected = true, actual = taskOne.contains(listOf(1, 2, 3), 2))
    }

    // 9.
    @Test
    fun `should return longest word`() {
        assertEquals(expected = "Hallo", actual = taskOne.longestWord(listOf("Hallo", "Welt")))
    }

    // 10.
    @Test
    fun `should fill array with ten numbers`() {
        assertEquals(expected = 10, actual = taskOne.fillWithTenNumbers().size)
    }

    // 11.
    @Test
    fun `should fill array with random numbers`() {
        assertEquals(expected = 42, actual = taskOne.fillWithTenRandomNumbers(42).size)
    }

    // 12.
    @Test
    fun `should return min and max`() {
        assertEquals(expected = Pair(1, 3), actual = taskOne.minMax(listOf(1, 2, 3)))
    }

    // 13.
    @Test
    fun `should calculate factorial`() {
        assertEquals(expected = 120, actual = taskOne.factorial(5))
    }

    // 14.
    @Test
    fun `should calculate fibonacci`() {
        assertEquals(expected = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55), actual = taskOne.fibonacci(10))
    }

    // 15.
    @Test
    fun `should return square of number`() {
        assertEquals(expected = listOf(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), actual = taskOne.squares())
    }

    // 16
    @Test
    fun `should reverse string`() {
        assertEquals(expected = "ollaH", actual = taskOne.reverseString("Hallo"))
    }

    // 17
    @Test
    fun `should return true if string is palindrome`() {
        assertEquals(expected = true, actual = taskOne.isPalindrome("otto"))
        assertEquals(expected = false, actual = taskOne.isPalindrome("hallo"))
    }

    // 18
    @Test
    fun `should count vowels in string`() {
        assertEquals(expected = 4, actual = taskOne.countVowels("Gabelstapler"))
    }

    // 19
    @Test
    fun `should return pascal triangle`() {
        assertEquals(
            expected = listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1),
                listOf(1, 4, 6, 4, 1)
            ), actual = taskOne.pascalTriangle(5)
        )
    }

    // 20
    @Test
    fun `should sort list ascending and descending`() {
        assertEquals(
            expected = taskOne.sortAscendingDescending(listOf(21, 237, 53, 1, 2, -3)),
            actual = listOf(-3, 1, 2, 21, 53, 237) to listOf(237, 53, 21, 2, 1, -3)
        )
    }

    // 21
    @Test
    fun `should test if a number is prime`() {
        assertEquals(expected = true, actual = taskOne.isPrime(7))
        assertEquals(expected = false, actual = taskOne.isPrime(8))
    }

    // 22
    @Test
    fun `should calculate sum of all numbers in list`() {
        assertEquals(expected = 6, actual = taskOne.sum(listOf(1, 2, 3)))
    }

    // 23
    @Test
    fun `should return a duplicate of a list`() {
        assertEquals(expected = listOf(1, 2, 3, 1, 2, 3), actual = taskOne.duplicateList(listOf(1, 2, 3)))
    }

    // 24
    @Test
    fun `should check of to arrays are identical`() {
        assertEquals(expected = true, actual = taskOne.areIdentical(arrayOf(1, 2, 3), arrayOf(1, 2, 3)))
        assertEquals(expected = false, actual = taskOne.areIdentical(arrayOf(1, 2, 3), arrayOf(1, 2, 4)))
    }

    // 25
    @Test
    fun `should print reversed array`() {
        assertEquals(expected = listOf(3, 2, 1), actual = taskOne.reversedList(listOf(1, 2, 3)))
    }

    // 26
    @Test
    fun `should find second smallest and second largest number in array`() {
        assertEquals(expected = Pair(2, 2), actual = taskOne.findSecondSmallestAndSecondLargest(arrayOf(1, 2, 3)))
    }

    // 27
    @Test
    fun `should copy two arrays into one`() {
        assertEquals(
            expected = arrayOf(1, 2, 3, 4, 5, 6).toList(),
            actual = taskOne.copyArrays(arrayOf(1, 2, 3), arrayOf(4, 5, 6)).toList()
        )
    }

    // 28
    @Test
    fun `should find common elements in two lists`() {
        assertEquals(
            expected = listOf(1, 2, 3),
            actual = taskOne.findCommonElements(listOf(1, 2, 3, 4, 5), listOf(1, 2, 3, 6, 7))
        )
    }

    // 29
    @Test
    fun `should test if a number is odd`() {
        assertEquals(expected = true, actual = taskOne.isOdd(3))
        assertEquals(expected = false, actual = taskOne.isOdd(4))
    }
}