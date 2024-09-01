import java.util.Scanner;

public class OneDToTwoDArray {
    public void convert(int[] oneD , int m, int n){
        if(oneD.length == (m*n)){
            int result[][] = new int[m][n];
            int count=0;
            for(int i=0 ; i<m; i++){
                for(int j=0 ; j<n ; j++){
                    result[i][j] = oneD[count];
                    count++;
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("We cannot convert 1D array to 2D array with given m,n values");
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        OneDToTwoDArray ot = new OneDToTwoDArray();
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
        ot.convert(oneD, m, n);
    }
}
