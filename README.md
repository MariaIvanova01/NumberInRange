# NumberInRange

Write a program to enter an integer in a certain range. Until the number is not valid, enter a new number from the console. When the number is valid - end the program.

Input
-----------------

	Read a range - two numbers, separated by a space.

	On the next line, read the String.

Output
---------------------

	Print the range in the following format: "Range: [{startIndex}...{endIndex}]".

	When an invalid number is entered, String or the number is out of range, print "Invalid number: {num}".

	When the entered number is valid, print "Valid number: {num}".

Input	| Output
------|---------
10 20 | Range: [10...20]
5 | Invalid number: 5
xx | Invalid number: xx
20 |	Invalid number: xx

Input	| Output
------|---------
-5 50 | Range: [-5...50]
hi | Invalid number: hi
-6 | Invalid number: -6
-1 | Valid number: -1

