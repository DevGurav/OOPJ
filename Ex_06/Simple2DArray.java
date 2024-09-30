public class Simple2DArray {

    public static void main(String[] args) {
        // Initialize a 2D array (3x3 matrix)
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the sum of all elements in the 2D array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        // Print the sum of the 2D array elements
        System.out.println("Sum of all elements: " + sum);
    }
}
