
/**
 * Matrix Class Assignment
 * The students will complete the methods in this class
 * 
 * @author gk CPM 
 * @version 12/18/18, 1/14/19
 */
public class SquareMatrix
{
    // instance array representing the integers within the square matrix
    private int[][] myIntArray;

    /**
     * Constructor for objects of class SquareMatrix
     * 
     * @param  array   a 2-D array of integers
     */
    public SquareMatrix(int[][] intArray)
    {
        // initialise instance variable
        myIntArray = intArray;
    }
    
    /**
     * Accessor method for the instance 2-D array
     * 
     * @return  the instance 2-D array of integers
     */
    public int[][] getArray()
    {
        return myIntArray;
    }
    
    /**
     * Mutator method for the instance 2-D array
     * 
     * @param  array   a 2-D array of integers
     */
    public void setArray(int[][] intArray)
    {
        myIntArray = intArray;
    }

    /**
     * Add two square Matrices and return the result as a new Matrix
     * 
     * @param  nextMatrix   The matrix to be summed
     * @return     a new Matrix resulting from the sum of
     *             this instance matrix and the nextMatrix
     */
    public SquareMatrix add(SquareMatrix nextMatrix)
    {
        //complete this method
        return nextMatrix;
    }
    
    /**
     * Subtract two square Matrices and return the result as a new Matrix
     * 
     * @param  nextMatrix   The matrix to be subtracted
     * @return     a new Matrix representing the difference of
     *             this instance matrix and the nextMatrix
     */
    public SquareMatrix subtract(SquareMatrix nextMatrix)
    {
        //complete this method
        return nextMatrix;
    }
    
    /**
     * Multiply two square Matrices and return the result as a new Matrix
     * 
     * @param  nextMatrix   The matrix to be multiplied
     * @return     a new Matrix representing the product of
     *             this instance matrix and the nextMatrix
     */
    public SquareMatrix multiply(SquareMatrix nextMatrix)
    {
        //complete this method
        return nextMatrix;
    }

    /**
     * Compares SquareMatrix sizes and contents
     * 
     * @return     true if content and size are equal otherwise false 
     */
    public boolean equals(SquareMatrix nextMatrix)
    {
        //get the array from the SquareMatrix parameter
        int[][] nextArray = nextMatrix.getArray();
        
        //check to see if the instance array and parameter array are the same size
        if(myIntArray.length != nextArray.length || myIntArray[0].length != nextArray[0].length)
          return false; //stop execution of the method
        
        int sideLen = nextArray.length;
        boolean verified = true;        
        //check to see that both of the array's contents are the same
        for(int row = 0; row < sideLen; row++)
           for(int col = 0; col < sideLen; col++) 
              if(myIntArray[row][col] != nextArray[row][col]) 
                 verified = false;
        
        return verified;
    }
    
    /**
     * toString
     * 
     * @return     The size of this square matrix 
     */
    public String toString()
    {
        int len = myIntArray.length;
        return "This square matrix is a " + len + " x " + len + ".";
    }
}
