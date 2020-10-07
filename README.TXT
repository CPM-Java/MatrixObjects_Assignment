class SquareMatrix 

public SquareMatrix(int[][] intArray)
Constructor for objects of class SquareMatrix
Parameters:
array - a 2-D array of integers

public SquareMatrix add(SquareMatrix nextMatrix)
Add two square Matrices and return the result as a new Matrix 
Parameters:
nextMatrix - The matrix to be summed
Returns:
a new Matrix resulting from the sum of
this instance matrix and the nextMatrix

public boolean equals(SquareMatrix nextMatrix)
Compares SquareMatrix sizes and contents
Returns:
true if content and size are equal otherwise false

public int[][] getArray()
Accessor method for the instance 2-D array
Returns:
the instance 2-D array of integers

public SquareMatrix multiply(SquareMatrix nextMatrix)
Multiply two square Matrices and return the result as a new Matrix 
Parameters:
nextMatrix - The matrix to be multiplied
Returns:
a new Matrix representing the product of
this instance matrix and the nextMatrix

public void setArray(int[][] intArray)
Mutator method for the instance 2-D array
Parameters:
array - a 2-D array of integers

public SquareMatrix subtract(SquareMatrix nextMatrix)
Subtract two square Matrices and return the result as a new Matrix 
Parameters:
nextMatrix - The matrix to be subtracted
Returns:
a new Matrix representing the difference of
this instance matrix and the nextMatrix

public String toString()
Returns:
The size of this square matrix