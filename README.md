# java-fundamentals

* basics

-Main => methods:

1. main
2. pluralize : accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
3. flipNHeads :  that accepts an integer n and flips coins until n heads are flipped in a row.
4. clock : print out the current time to the console, second by second.

* basiclibrary

Library => methods:

1. roll : return an array of rolls a six-sided dice n times.
2. containsDuplicates : Returns true or false depending on whether the array contains duplicate values.
3. getAverage : accepts an array of integers and calculates and returns the average of all the values in the array.
4. lowestAverage : Accept array of arrays calculate the average value for each array and return the array with the lowest average.
5. getWeather : Iterate through all of the data to find the min and max values , create a String containing any temperature not seen during the month. Return that String.
6. Tally: accepts a List of Strings representing votes and returns one string to show what got the most votes.
 *In addition to a test for each method in the testing file.*

* linter
 Main => methods:

1. readJs (File I/O) :a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

AppTest.java =>
Test these 5 js files in 5 different cases using JUnit as below:

Test the linter on a file that contains no errors.
Test the linter on a file that contains one error.
Test the linter on a file that contains few errors.
Test the linter on a file that contains many errors.
Test the linter on an empty file.

**Error Message sample**
"Line 3: Missing semicolon."