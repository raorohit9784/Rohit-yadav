import java.util.*;

public class twodarray {
  public static void main(String args[]) {
    Scanner Sc = new Scanner(System.in);
    int rows = Sc.nextInt();
    int cols = Sc.nextInt();

    int[] [] numbers = new int[rows][cols];
    //input 
    //rows
    for(int i=0; i<rows; i++) {
        //columns
        for(int j=0; j<cols; j++) {
            numbers[i] [j] = Sc.nextInt();

        }
    }
        //output
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] +" ");

            }
            System.out.println();
    }   }    
}
