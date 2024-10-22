object TaskTwo {

    // 1. Schreibe eine Funktion, die prüft, ob eine Zahl positiv, negativ oder null ist.
    // Sie gibt dann "positive", "negative" oder "zero" zurück.
    // 1. Write a function that checks if a number is positive, negative, or zero.
    // It then returns "positive", "negative", or "zero".
    fun checkOverUnderZero(number: Int): String {
        throw NotImplementedError("TODO")
    }

    // 2. Schreibe eine Funktion, die den Umfang und den Flächeninhalt eines Kreises berechnet.
    // 2. Write a function that calculates the circumference and area of a circle.
    fun circle(radius: Double): Pair<Double, Double> {
        throw NotImplementedError("TODO")
    }

    // 3. Schreibe eine Funktion, die die Sekunden in Stunden, Minuten und Sekunden umwandelt.
    // 3. Write a function that converts seconds into hours, minutes, and seconds.
    fun secondsToHoursMinutesSeconds(seconds: Int): Triple<Int, Int, Int> {
        throw NotImplementedError("TODO")
    }

    // 4. Schreibe eine Funktion, die prüft, ob ein Jahr ein Schaltjahr ist.
    // 4. Write a function that checks if a year is a leap year.
    fun isLeapYear(year: Int): Boolean {
        throw NotImplementedError("TODO")
    }

    // 5. Schreibe eine Funktion, die eine Zeichenkette in Kleinbuchstaben umwandelt.
    // 5. Write a function that converts a string to lowercase.
    fun toLowerCase(string: String): String {
        throw NotImplementedError("TODO")
    }

    // 6. Schreibe eine Funktion, die die Ziffernsumme einer Zahl berechnet.
    // 6. Write a function that calculates the digit sum of a number.
    fun digitSum(number: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 7. Schreibe eine Funktion, die alle Zahlen von 1 bis n ausgibt, die durch 3 oder 5 teilbar sind.
    // 7. Write a function that prints all numbers from 1 to n that are divisible by 3 or 5.
    fun divisibleByThreeOrFive(n: Int): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 8. Schreibe eine Funktion, die alle Primzahlen bis zu einer gegebenen Zahl n ausgibt.
    // 8. Write a function that prints all prime numbers up to a given number n.
    fun primes(n: Int): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 9. Schreibe eine Funktion, die die Quersumme einer Zahl auf rekursive Weise berechnet.
    // 9. Write a function that calculates the digit sum of a number recursively.
    fun digitSumRecursive(number: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 10. Schreibe eine Funktion, die die Anzahl der Wörter in einem Satz zählt.
    // 10. Write a function that counts the number of words in a sentence.
    fun wordCount(sentence: String): Int {
        throw NotImplementedError("TODO")
    }

    // 11. Schreibe eine Funktion, die die Anzahl der Großbuchstaben und Kleinbuchstaben in einem String zählt.
    // 11. Write a function that counts the number of uppercase and lowercase letters in a string.
    fun countUpperAndLowerCase(string: String): Pair<Int, Int> {
        throw NotImplementedError("TODO")
    }

    // 12. Schreibe eine Funktion, die die Anzahl der Zeichen in einem String ohne Leerzeichen zählt.
    // 12. Write a function that counts the number of characters in a string excluding spaces.
    fun countCharactersWithoutSpaces(string: String): Int {
        throw NotImplementedError("TODO")
    }

    // 13. Schreibe eine Funktion, die die Anzahl der Ziffern in einem String zählt.
    // 13. Write a function that counts the number of digits in a string.
    fun countDigits(string: String): Int {
        throw NotImplementedError("TODO")
    }

    // 14. Schreibe eine Funktion, die die Anzahl der speziellen Zeichen in
    // einem String zählt (alle die keine Buchstaben oder Ziffern sind).
    // 14. Write a function that counts the number of special characters in a string (all that are not letters or digits).
    fun countSpecialCharacters(string: String): Int {
        throw NotImplementedError("TODO")
    }

    // 15. Schreibe eine Funktion, die eine Zahlenreihe ausgibt, bei der jedes nächste Element die Summe der vorherigen beiden ist.
    // Beginne mit 0 und 1.
    // 15. Write a function that prints a series of numbers where each next element is the sum of the previous two.
    // Start with 0 and 1.
    fun sumOfPrevious(n: Int): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 16. Schreibe eine Funktion, die die Ziffern einer Zahl in umgekehrter Reihenfolge ausgibt.
    // 16. Write a function that prints the digits of a number in reverse order.
    fun reverseDigits(number: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 17. Schreibe eine Funktion, die prüft, ob alle Zeichen in einem String einzigartig sind.
    // exkludiert sind whitespaces.
    // 17. Write a function that checks if all characters in a string are unique.
    // Excludes whitespaces.
    fun isUnique(string: String): Boolean {
        throw NotImplementedError("TODO")
    }

    // 18. Schreibe eine Funktion, die die ersten n Elemente der Reihe der Quadratzahlen ausgibt.
    // 18. Write a function that prints the first n elements of the series of square numbers.
    fun squares(n: Int): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 19. Schreibe eine Funktion, die die Summe der Zahlen in einer Liste berechnet, die an geraden Indizes stehen.
    // 19. Write a function that calculates the sum of the numbers in a list that are at even indices.
    fun sumOfEvenIndices(list: List<Int>): Int {
        throw NotImplementedError("TODO")
    }

    // 20. Schreibe eine Funktion, die das kleinste und das größte Element in einer Listefindet.
    // 20. Write a function that finds the smallest and largest element in a list.
    fun minAndMax(list: List<Int>): Pair<Int, Int> {
        throw NotImplementedError("TODO")
    }

    // 21. Schreibe eine Funktion, die alle Elemente einer Liste ausgibt, die größer als der Durchschnitt aller Elemente sind.
    // 21. Write a function that prints all elements of a list that are greater than the average of all elements.
    fun greaterThanAverage(list: List<Int>): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 22. Schreibe eine Funktion, die die Anzahl der Elemente in einer Liste zählt, die größer als ein gegebener Wert sind.
    // 22. Write a function that counts the number of elements in a list that are greater than a given value.
    fun countGreaterThan(list: List<Int>, value: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 23. Schreibe eine Funktion, die die Summe der Quadrate aller Zahlen in einer Liste berechnet.
    // 23. Write a function that calculates the sum of the squares of all numbers in a list.
    fun sumOfSquares(list: List<Int>): Int {
        throw NotImplementedError("TODO")
    }

    // 24. Schreibe eine Funktion, die eine Liste von Zahlen so sortiert, dass alle ungeraden Zahlen zuerst und dann alle geraden Zahlen erscheinen.
    // 24. Write a function that sorts a list of numbers so that all odd numbers appear first and then all even numbers.
    fun sortOddAndEven(list: List<Int>): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 25. Schreibe eine Funktion, die den größten gemeinsamen Teiler (GGT) von zwei Zahlen berechnet.
    // 25. Write a function that calculates the greatest common divisor (GCD) of two numbers.
    fun ggt(a: Int, b: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 26. Schreibe eine Funktion, die das kleinste gemeinsame Vielfache (kgV) von zwei Zahlen berechnet.
    // 26. Write a function that calculates the least common multiple (LCM) of two numbers.
    fun kgv(a: Int, b: Int): Int {
        throw NotImplementedError("TODO")
    }

    // 27. Schreibe eine Funktion, die prüft, ob eine gegebene Zahl eine perfekte Zahl ist.
    // 27. Write a function that checks if a given number is a perfect number.
    fun isPerfectNumber(number: Int): Boolean {
        throw NotImplementedError("TODO")
    }

    // 28. Schreibe eine Funktion, die die ersten n perfekten Zahlen ausgibt.
    // 28. Write a function that prints the first n perfect numbers.
    fun perfectNumbers(n: Int): List<Int> {
        throw NotImplementedError("TODO")
    }

    // 29. Schreibe eine Funktion, die den Durchschnitt aller ungeraden Zahlen in einer Liste berechnet.
    // 29. Write a function that calculates the average of all odd numbers in a list.
    fun averageOfOddNumbers(list: List<Int>): Double {
        throw NotImplementedError("TODO")
    }

    // 30. Schreibe eine Funktion, die eine Dezimalzahl in eine Binärzahl umwandelt.
    // 30. Write a function that converts a decimal number to a binary number.
    fun decimalToBinary(a: Int): String {
        throw NotImplementedError("TODO")
    }

    // 31. Schreibe eine Funktion, die eine Binärzahl in eine Dezimalzahl umwandelt.
    // 31. Write a function that converts a binary number to a decimal number.
    fun binaryToDecimal(a: String): Int {
        throw NotImplementedError("TODO")
    }
}