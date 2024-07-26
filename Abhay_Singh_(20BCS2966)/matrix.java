import java.util.*;
class InputMatrix {
    Scanner input = new Scanner(System.in);
    InputMatrix(int rows,int col){
        int[][] matrix = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++)
            {
                System.out.print("Drop element of matrix["+i+"]["+j+"] :\n");
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.print("Total Numbers of Rows. are :\t"+rows);
        System.out.print("\nTotal Numbers of Col. are :\t"+col);

        System.out.print("Elements of Matrix :\n");
        for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print("| "+(matrix[i][j])+" |");
        }
        System.out.print("\n");
    }

        System.out.print("\nAfter addition of elements\n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("| "+(matrix[i][j]+matrix[i][j])+" |");
            }
            System.out.print("\n");
        }
        System.out.print("\nAfter multiplcation of elements\n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("| "+(matrix[i][j]*matrix[i][j])+" |");
            }
            System.out.print("\n");
        }
}
}

class matrix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Drop rows of matrix:\n");
        int rows = input.nextInt();
        System.out.print("Drop col of matrix:\n");
        int col = input.nextInt();
        InputMatrix object = new InputMatrix(rows,col);
        System.out.println("\nMohit lal\n");
        System.out.println("\n20BCS2977");
    }
}













