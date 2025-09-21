import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class sudoku {
    private static final int GRID_SIZE = 9;
    private static final int SUBGRID_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Level : 1.Easy 2.Medium 3.Hard 4.Extreme");
        int choice = scanner.nextInt();
        int n;

        switch(choice){
            case 1: n = 100;
                    break;
            case 2: n = 80;
                    break;
            case 3: n = 60;
                    break;
            case 4: n = 40;
                    break;
            default: System.out.println("Invalid choice!");
                    return;                              
        }

        int[][] grid = generateGrid(n);
        System.out.println("Welcome to Sudoku!");
        printGrid(grid);

        
        while (true) {
            System.out.println("\nEnter your move (row, col, number) or type 'solve' to solve the puzzle:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("solve")) {
                if (solve(grid)) {
                    System.out.println("\nSolved Sudoku:");
                    printGrid(grid);
                } else {
                    System.out.println("No solution exists!");
                }
                break;
            }

            try {
                String[] parts = input.split(" ");
                int row = Integer.parseInt(parts[0]) - 1;
                int col = Integer.parseInt(parts[1]) - 1;
                int num = Integer.parseInt(parts[2]);

                if (isValidMove(grid, row, col, num)) {
                    grid[row][col] = num;
                    printGrid(grid);
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter row, col, number separated by spaces.");
            }
        }

        scanner.close();
    }

    private static int[][] generateGrid(int n) {
        int[][] grid = new int[GRID_SIZE][GRID_SIZE];
        Random random = new Random();

        // Generate a random valid grid
        for (int i = 0; i < n; i++) { // Pre-fill 20 random cells
            int row = random.nextInt(GRID_SIZE);
            int col = random.nextInt(GRID_SIZE);
            int num = random.nextInt(GRID_SIZE) + 1;

            if (isValidMove(grid, row, col, num)) {
                grid[row][col] = num;
            }
        }
        return grid;
    }

    private static void printGrid(int[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                System.out.print(grid[row][col] == 0 ? "." : grid[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int[][] grid, int row, int col, int num) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        int startRow = (row / SUBGRID_SIZE) * SUBGRID_SIZE;
        int startCol = (col / SUBGRID_SIZE) * SUBGRID_SIZE;

        for (int r = startRow; r < startRow + SUBGRID_SIZE; r++) {
            for (int c = startCol; c < startCol + SUBGRID_SIZE; c++) {
                if (grid[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean solve(int[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidMove(grid, row, col, num)) {
                            grid[row][col] = num;
                            if (solve(grid)) {
                                return true;
                            }
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}