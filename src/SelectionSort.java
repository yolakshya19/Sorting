import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        selection(num);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(num));
    }

    static void selection(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int last = n-i-1;
            int maximum= getmax(nums,0,last);
            swap(nums,last,maximum);
        }
    }

    static int getmax(int[] arr, int first, int last){
        int maxi = first;
        for(int i=1;i<=last;i++){
            if(arr[maxi] < arr[i]){
                maxi = i;
            }
        }
        return maxi;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
}
