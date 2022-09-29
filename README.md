Problem Statement
Write a program that accepts sets of three numbers and prints the second-maximum number among the three.

Input

	
First line contains the number of triples, N.
	
The next N lines which follow each have three space separated integers.

Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.

Constraints


	
1 ≤ N ≤ 6
	
1 ≤ every integer ≤ 10000
	
The three integers in a single triplet are all distinct. That is, no two of them are equal.

Sample Input
3
1 2 3
10 15 5
100 999 500
Sample Output
2
10
500
=========================================
Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input


	
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
	
Each test case is described with a single line containing a string S, the alphanumeric string.

Output


	
For each test case, output a single line containing the sum of all the digit characters in that string.

Constraints


	
1 ≤ T ≤ 1000
	
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.

Example
Input:
1
ab1231da
Output:
7

Explanation
The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
=========================================
Problem statement
Largest Gap (Java)

Given an array of integers, return the largest gap between the sorted elements of the array.

For example, consider the array:


[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]


... in which, after sorting, the array becomes:


[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]


... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

Examples


largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11

// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]

// Largest gap between 9 and 20 is 11

 

largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4

// After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]

// Largest gap between 7 and 11 is 4

 

largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2

// After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]

// Largest gap between 6 and 8 is 2