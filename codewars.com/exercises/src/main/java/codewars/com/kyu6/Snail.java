package codewars.com.kyu6;

/**
 * Snail Sort
 * Given an n x n array, return the array elements arranged from outermost elements to the middle
 * element, traveling clockwise.
 * 
 * array = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * snail(array) #=> [1,2,3,6,9,8,7,4,5]
 * For better understanding, please follow the numbers of the next array consecutively:
 * 
 * array = [[1,2,3],
 * [8,9,4],
 * [7,6,5]]
 * snail(array) #=> [1,2,3,4,5,6,7,8,9]
 */

public class Snail {

    private Snail() {
        throw new IllegalStateException("Utility class");
    }
    
    private static int[][] trimTop(int[][] arr) {
        int rows = arr.length - 1;
        int columns = arr[0].length;
        
        int[][] newArray = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = arr[i + 1][j];
            }
        }
        
        return newArray;
    }
    
    private static int[][] trimRight(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length - 1;
        
        int[][] newArray = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = arr[i][j];
            }
        }
        
        return newArray;
    }
    
    private static int[][] trimLeft(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length - 1;
        
        int[][] newArray = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = arr[i][j + 1];
            }
        }
        
        return newArray;
    }
    
    private static int[][] trimBottom(int[][] arr) {
        int rows = arr.length - 1;
        int columns = arr[0].length;
        
        int[][] newArray = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = arr[i][j];
            }
        }
        
        return newArray;
    }
    
    private static int[] readTop(int[][] arr) {
        int[] result = new int[arr[0].length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[0][i];
        }
        
        return result;
    }
    
    private static int[] readRight(int[][] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i][arr[0].length - 1];
        }
        
        return result;
    }
    
    private static int[] readLeft(int[][] arr) {
        int[] result = new int[arr.length];
        int reversei = result.length - 1;
        
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[reversei][0];
            reversei -= 1;
        }
        
        return result;
    }
    
    private static int[] readBottom(int[][] arr) {
        int[] result = new int[arr[0].length];
        int reversei = result.length - 1;
        
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[arr.length - 1][reversei];
            reversei -= 1;
        }
        
        return result;
    }
    
    private static int[] concat(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
        }
        
        int counter = 0;
        for (int i = left.length; i < result.length; i++) {
            result[i] = right[counter];
            counter++;
        }
        
        return result;
    }
    
    public static int[] snail(int[][] array) {
        // enjoy
        
        int[][] newArray = array.clone();
        int[] result = new int[0];
        
        while (newArray.length > 0 && newArray[0].length > 0) {
            if (newArray.length > 0) {
                result = concat(result, readTop(newArray));
                newArray = trimTop(newArray);
            }
            if (newArray.length > 0) {
                result = concat(result, readRight(newArray));
                newArray = trimRight(newArray);
            }
            if (newArray.length > 0) {
                result = concat(result, readBottom(newArray));
                newArray = trimBottom(newArray);
            }
            if (newArray.length > 0) {
                result = concat(result, readLeft(newArray));
                newArray = trimLeft(newArray);
            }
        }
        
        return result;
    }
}
