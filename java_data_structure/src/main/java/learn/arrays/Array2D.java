package learn.arrays;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        // Created a Tic Tac Toe game
        char[][] board = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        //  Another way to create a Tic Tac Toe grid game

        char[][] boardTwo = new char[][] {
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));

    }
}

// Java 2D Array Notes:

// 1. Declaration: A 2D array in Java is declared as type[][] arrayName;
//    Example: int[][] matrix;

// 2. Instantiation: Create a 2D array with specified dimensions.
//    Example: matrix = new int[rows][columns];

// 3. Initialization: You can initialize a 2D array inline.
//    Example: int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// 4. Accessing Elements: Access elements using row and column indices.
//    Example: int element = matrix[0][2]; // Accesses the element in first row and third column

// 5. Iterating: Use nested loops to iterate through rows and columns.
//    for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[i].length; j++) {
//            // Process element matrix[i][j]
//        }
//    }

// 6. Variable Row Lengths: In Java, 2D arrays can have rows of different lengths.
//    Example: int[][] array = new int[3][];
//             array[0] = new int[2];
//             array[1] = new int[3];
//             array[2] = new int[1];

// 7. Use Cases: Ideal for representing matrices, grids, tables, etc.

// 8. Memory Consideration: Large 2D arrays can consume significant memory.

// 9. Java-Specific: In Java, 2D arrays are actually arrays of arrays, which means each row is an object itself,
//    potentially leading to non-contiguous memory allocation for rows.

// 10. Flexibility: Java 2D arrays offer flexibility but require careful handling of row and column lengths,
//     especially in cases where these lengths can vary.