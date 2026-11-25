import java.util.*;

public class TwoDArray{
    public static void main
    (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of row");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        //  Input
        // rows__>
        for(int i = 0;i <rows;i++){
            // Columns-->
            for(int j = 0;j < columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i = 0;i < rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}