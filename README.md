# 1DTo2DArray
2022. Convert 1D Array Into 2D Array

You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. 
You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, 
the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.

Example 1:

Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]
Explanation: The constructed 2D array should contain 2 rows and 2 columns.
The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.

Example 2:

Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]
Explanation: The constructed 2D array should contain 1 row and 3 columns.
Put all three elements in original into the first row of the constructed 2D array.

Example 3:

Input: original = [1,2], m = 1, n = 1
Output: []
Explanation: There are 2 elements in original.
It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.
 
Constraints:

1 <= original.length <= 5 * 104
1 <= original[i] <= 105
1 <= m, n <= 4 * 104

Solution : 1

Time complexity :
    the time complexity of the function is O(n^2)

We want to conver 1d-array to 2d-array. so we need the dimensions of the 2d array and see if the dimensions are compatible to 
fit the elements od a 1d array into a 2d array. so we check the condition that if the size of 1d array is equal to the size of the 2d array which 
is m*n.

The base condition is 1darray.length == m*n 

And then simply we iterate throught each elemnt of the 1d array and place it in a 2d array

Solution : 2

Time Complexity :
    the time complexity of the function is O(n) for only the logic but not fot the printing stattements

Here we use the same base condition as above but for the actual logic we use the inbuilt function which copies the array elemnts 
from a start index to the end index mentiond in the paranthesis.
