
/**
 * Driver for the SquareMatrix assignment.
 * DO NOT MODIFY
 * @author GrayKnight CPM 2018 
 * @version 12/18/18, 1/14/19
 */

import java.util.Scanner;
import java.util.Random;

public class MatrixDriver
{
    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();
    
    private ArrayGenerator myAG = new ArrayGenerator();
    
    private SquareMatrix matrixA;
    private SquareMatrix matrixB;
    
    /**
     * Manages the user interface for the Matrix Demonstrator
     */
    public void matrixDriverUI()
    {
        System.out.println("Square Matrix Object Demonstrator\n");
        
        this.newSquareMatrices();

        String opStr = "N";
        while(!opStr.equals("Q") && !opStr.equals("q") )
        {
            System.out.print("(N)ew Matrices, (A)dd, (S)ubtract, (M)ultiply, (Q)uit? :");
            opStr = scan.nextLine();
            System.out.println("\n");
            
            if(opStr.equals("N") || opStr.equals("n")){
            
                this.newSquareMatrices();
            }
            else if(opStr.equals("A") || opStr.equals("a")){
            
                //Matrix Math
                SquareMatrix matrixC = matrixA.add(matrixB);
                //Display and Verify
                System.out.println(MatrixDisplay.matrix3Str(matrixA,matrixB,matrixC,"+"));
            }
            else if(opStr.equals("S") || opStr.equals("s")){
            
                //Matrix Math
                SquareMatrix matrixC = matrixA.subtract(matrixB);
                //Display and Verify
                System.out.println(MatrixDisplay.matrix3Str(matrixA,matrixB,matrixC,"-"));
            }
            else if(opStr.equals("M") || opStr.equals("m")){
            
                //Matrix Math
                SquareMatrix matrixC = matrixA.multiply(matrixB);
                //Display and Verify
                System.out.println(MatrixDisplay.matrix3Str(matrixA,matrixB,matrixC,"*"));
            }
            
        }//end of while
        System.out.println("\nGoodbye!\n");
    }//end of method
    
    //Initializes the instance SquareMatrices from the MatrixDisplay
    //Checks the instance SquareMatrix objects for equality
    //Displays the SquareMatrix contents
    private void newSquareMatrices()
    {
        //size of the 2D arrays and SquareMatrices
        int sizeNum = 2 + rand.nextInt(3);
            
        // Square Arrays are created
        int[][] arrayA = myAG.makeSQarray(sizeNum);
        int[][] arrayB = myAG.makeSQarray(sizeNum);
            
        //create Square Matrices from the arrays
        matrixA = new SquareMatrix(arrayA);
        matrixB = new SquareMatrix(arrayB);
        
        String sameStr = "≠";
        if(matrixA.equals(matrixB))sameStr = "=";
                
        //display
        System.out.println(MatrixDisplay.matrix2Str(matrixA, matrixB, sameStr));
            
    }
}
