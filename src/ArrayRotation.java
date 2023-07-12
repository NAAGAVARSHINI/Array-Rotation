import java.util.Scanner;

public class ArrayRotation {

    public static int[] rightRotate(int array[], int a, int b) {
        int size= array.length;
        int i=a, j=b;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j]= temp;
            i++;
            j--;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int k= sc.nextInt();

        array=rightRotate(array, 0, n-1);
        array=rightRotate(array, 0,k-1);
        array=rightRotate(array, k, n-1);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
           }
}
