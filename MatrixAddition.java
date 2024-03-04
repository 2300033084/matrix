import java.util.Scanner; // Import Scanner class from java.util package

public class MatrixAddition {
    public static void main(String[] args) {
        int r1, c1, r2, c2; // Declare variables to store dimensions of matrices
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        
        // Prompt the user to enter dimensions of the first matrix
        System.out.println("Enter r1, c1: ");
        r1 = sc.nextInt(); // Read the number of rows of first matrix
        c1 = sc.nextInt(); // Read the number of columns of first matrix
        
        // Prompt the user to enter dimensions of the second matrix
        System.out.println("Enter r2, c2: ");
        r2 = sc.nextInt(); // Read the number of rows of second matrix
        c2 = sc.nextInt(); // Read the number of columns of second matrix
        
        // Check if matrix addition is possible
        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition is not possible!"); 
            System.exit(0); // Terminate the program
        }
        
        // Declare arrays to store the matrices
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        
        // Read elements of the first matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt(); // Read the element at position (i, j)
            }
        }
        
        // Read elements of the second matrix
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt(); // Read the element at position (i, j)
            }
        }
        
        // Declare array to store the result matrix
        int c[][] = new int[r1][c1];
        
        // Perform matrix addition
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                c[i][j] = a[i][j] + b[i][j]; // Add corresponding elements
            }
        }
        
        // Display the result matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(c[i][j] + "  "); // Print each element
            }
            System.out.println(""); // Move to the next row
        }
    }
}
