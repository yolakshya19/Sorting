import java.util.Arrays;

public class InsertionSort  {
    public static void main(String[] args) {
        int[] nums = {-4,-7,-48,-75,-24};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[]arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
