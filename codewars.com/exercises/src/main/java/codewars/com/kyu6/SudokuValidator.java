package codewars.com.kyu6;

/**
 * Sudoku Solution Validator
 * Write a function validSolution/ValidateSolution/valid_solution() that accepts a 2D array
 * representing a Sudoku board, and returns true if it is a valid solution, or false otherwise.
 * The cells of the sudoku board may also contain 0's, which will represent empty cells.
 * Boards containing one or more zeroes are considered to be invalid solutions.
 * 
 * The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.
 */
public class SudokuValidator {
    private SudokuValidator() {
        throw new IllegalStateException("Utility class");
    }
    
    private static boolean sanityChecks(int[][] array) {
        boolean is9by9 = false;
        boolean noZero = true;
        boolean validInts = true;
        
        if (array.length == 9 && array[0].length == 9) {
            is9by9 = true;
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] == 0) {
                    noZero = false;
                }
                
                if (0 > array[i][j] || array[i][j] > 9) {
                    validInts = false;
                }
                
            }
        }
        
        return noZero && is9by9 && validInts;
    }
    
    /** checks if a sequence is "sudoku correct" */
    private static boolean checkSequence(int[] array) {
        int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        /**
         * i could copy array to List, sort it and check if they are same with sampleArray,
         * but i didnt.
         */
        
        int counter = 0;
        
        for (int sampleInt : sampleArray) {
            for (int i = 0; i < 9; i++) {
                if (sampleInt == array[i] && array[i] > 0) {
                    counter++;
                    array[i] = 0;
                    sampleInt = 0;
                }
            }
        }
        return counter == 9;
    }
    
    /** returns single collumn as sequence */
    private static int[] getCollumn(int[][] array, int coll) {
        int[] result = new int[9];
        
        for (int i = 0; i < 9; i++) {
            result[i] = array[i][coll];
        }
        return result;
    }
    
    /** returns single row as sequence */
    private static int[] getRow(int[][] array, int row) {
        int[] result = new int[9];
        
        for (int i = 0; i < 9; i++) {
            result[i] = array[row][i];
        }
        return result;
    }
    
    /** returns 3x3 "block" of sudoku as a sequence */
    private static int[] getBlock(int[][] array, int x, int y) {
        int[] result = new int[9];
        
        int counter = 0;
        for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
                result[counter] = array[i][j];
                counter++;
            }
        }
        return result;
    }
    
    private static boolean doTheThing(int[][] sudoku) {
        boolean collumns = true;
        boolean rows = true;
        boolean blocks = true;
        
        for (int i = 0; i < 9; i++) {
            if (!checkSequence(getCollumn(sudoku, i))) {
                collumns = false;
            }
            if (!checkSequence(getRow(sudoku, i))) {
                rows = false;
            }
        }
        
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkSequence(getBlock(sudoku, j, i))) {
                    blocks = false;
                }
            }
        }
        
        return collumns && rows && blocks;
    }
    
    public static boolean check(int[][] sudoku) {
        // do your magic
        boolean sanity = sanityChecks(sudoku);
        boolean arrays = doTheThing(sudoku);
        
        return sanity && arrays;
    }
}
