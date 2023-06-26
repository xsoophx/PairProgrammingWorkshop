import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TaskTwoTest {

    private val taskTwo = TaskTwo

    // 1.
    @Test
    fun `should check if mumber is over or under zero`() {
        assertEquals(expected = "positive", actual = taskTwo.checkOverUnderZero(1))
        assertEquals(expected = "negative", actual = taskTwo.checkOverUnderZero(-1))
        assertEquals(expected = "zero", actual = taskTwo.checkOverUnderZero(0))
    }

    // 2.
    @Test
    fun `should calculate circumference and area of circle`() {
        assertEquals(expected = 31.41592653589793 to 78.53981633974483, actual = taskTwo.circle(5.0))
    }

    // 3.
    @Test
    fun `should convert to hours, minutes and seconds`() {
        assertEquals(expected = Triple(1, 1, 1), actual = taskTwo.secondsToHoursMinutesSeconds(3661))
    }

    // 4.
    @Test
    fun `should calculate if year is leap year`() {
        assertEquals(expected = true, actual = taskTwo.isLeapYear(2020))
        assertEquals(expected = false, actual = taskTwo.isLeapYear(2021))
    }

    //5.
    @Test
    fun `should lowercase all letters in string`() {
        assertEquals(expected = "hallo", actual = taskTwo.toLowerCase("HALLO"))
    }

    // 6.
    @Test
    fun `should calculate sum of all digits in number`() {
        assertEquals(expected = 6, actual = taskTwo.digitSum(123))
    }

    // 7.
    @Test
    fun `should calculate all dividends which are three or five`() {
        assertEquals(expected = listOf(3, 5, 6, 9, 10), actual = taskTwo.divisibleByThreeOrFive(10))
    }

    // 8.
    @Test
    fun `should calculate all primes until a number`() {
        assertEquals(expected = listOf(2, 3, 5, 7), actual = taskTwo.primes(10))
    }

    // 9.
    @Test
    fun `should calculate digit sum in a recursive way`() {
        assertEquals(expected = 6, actual = taskTwo.digitSumRecursive(123))
    }

    // 10.
    @Test
    fun `should count words in a sentence`() {
        assertEquals(expected = 6, actual = taskTwo.wordCount("Das ist ein tolles Kotlin Programm."))
    }

    // 11.
    @Test
    fun `should count number of upper and lower casing letters`() {
        assertEquals(
            expected = Pair(3, 26),
            actual = taskTwo.countUpperAndLowerCase("Das ist ein tolles Kotlin Programm.")
        )
    }

    // 12.
    @Test
    fun `should count characters without spaces`() {
        assertEquals(
            expected = 30,
            actual = taskTwo.countCharactersWithoutSpaces("Das ist ein tolles Kotlin Programm.")
        )
    }

    // 13.
    @Test
    fun `should count digits in string`() {
        assertEquals(
            expected = 8,
            actual = taskTwo.countDigits("4238 Bilder können aus 3 Enten R3ST4P1's entnommen werden.")
        )
    }

    // 14.
    @Test
    fun `should count special characters in string`() {
        assertEquals(expected = 11, actual = taskTwo.countSpecialCharacters("Das ist <Zahl> * <Sprache> Programm."))

    }

    // 15.
    @Test
    fun `should calculate fibonacci number`() {
        assertEquals(expected = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55), actual = taskTwo.sumOfPrevious(11))
    }

    // 16.
    @Test
    fun `should reverse digits of number`() {
        assertEquals(expected = 321, actual = taskTwo.reverseDigits(123))
    }

    // 17.
    @Test
    fun `should check if every character is unique`() {
        assertEquals(expected = false, actual = taskTwo.isUnique("Das ist ein tolles Kotlin Programm."))
        assertEquals(expected = true, actual = taskTwo.isUnique("Kotlin, C# & R."))
    }

    // 18.
    @Test
    fun `should calculate first n elements of square numbers`() {
        assertEquals(expected = listOf(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), actual = taskTwo.squares(10))
    }

    // 19.
    @Test
    fun `should calculate sum of even indices`() {
        assertEquals(expected = 9, actual = taskTwo.sumOfEvenIndices(listOf(1, 2, 3, 4, 5, 6)))
    }

    // 20.
    @Test
    fun `should calculate min and max in list`() {
        assertEquals(expected = 1 to 6, actual = taskTwo.minAndMax(listOf(1, 2, 3, 4, 5, 6)))
    }

    // 21.
    @Test
    fun `should calculate all numbers which are greater than average`() {
        assertEquals(expected = listOf(4, 5, 6), actual = taskTwo.greaterThanAverage(listOf(1, 2, 3, 4, 5, 6)))
    }

    // 22.
    @Test
    fun `should calculate all numbers which are greater than given number`() {
        assertEquals(expected = 3, actual = taskTwo.countGreaterThan(listOf(1, 2, 3, 4, 5, 6), 3))
    }

    // 23.
    @Test
    fun `should calculate sum of squares`() {
        assertEquals(expected = 91, actual = taskTwo.sumOfSquares(listOf(1, 2, 3, 4, 5, 6)))
    }

    // 24.
    @Test
    fun `should sort evens after odds`() {
        assertEquals(expected = listOf(1, 3, 5, 2, 4, 6), actual = taskTwo.sortOddAndEven(listOf(1, 2, 3, 4, 5, 6)))
    }

    // 25.
    @Test
    fun `should calculate ggt`() {
        assertEquals(expected = 6, actual = taskTwo.ggt(12, 18))
    }

    // 26.
    @Test
    fun `should calculate kgv`() {
        assertEquals(expected = 36, actual = taskTwo.kgv(12, 18))
    }

    // 27.
    @Test
    fun `should test if number is perfect number`() {
        assertEquals(expected = true, actual = taskTwo.isPerfectNumber(6))
        assertEquals(expected = false, actual = taskTwo.isPerfectNumber(7))
    }

    // 28.
    @Test
    fun `should test the first n numbers for perfect number`() {
        assertEquals(expected = listOf(6, 28), actual = taskTwo.perfectNumbers(30))
    }

    // 29.
    @Test
    fun `should calculate average of all odd numbers`() {
        assertEquals(expected = 3.0, actual = taskTwo.averageOfOddNumbers(listOf(1, 2, 3, 4, 5)))
    }

    // 30.
    @Test
    fun `should calculate binary of number`() {
        assertEquals(expected = "1010", actual = taskTwo.decimalToBinary(10))
    }

    // 31.
    @Test
    fun `should calculate decimal of binary`() {
        assertEquals(expected = 10, actual = taskTwo.binaryToDecimal("1010"))
    }
}