import java.util.Arrays;
import java.util.Scanner;

public class SimpleWay {
    public void convert(int[] oneD , int m, int n){
        if(m*n != oneD.length){
            System.out.println("We cannot convert 1D array to 2D array with given m,n values");
        }
        int[][] result = new int[m][];
        for(int i=0; i<m; i++){
           result[i] = Arrays.copyOfRange(oneD, i*n, i*n+n);
        }
        for(int i=0 ; i<m; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        SimpleWay sw = new SimpleWay();
        System.out.println("Enter the number of elemnts in 1D array : ");
        int k = sc.nextInt();
        int oneD[] = new int[k];
        System.out.println("Enter the elemnts in to the array : ");
        for(int i=0 ; i<k ;i++){
            oneD[i] = sc.nextInt();
        }
        System.out.println("Enter the value of m :");
        int m = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("The original array is:");
        for(int i=0;i<k;i++){
            System.out.print(oneD[i]+" ");
        }
        System.out.println();
        System.out.println("The converted array is :");
        sw.convert(oneD, m, n);
    }
}
