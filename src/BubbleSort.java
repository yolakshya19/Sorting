import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        bubble(num);

        System.out.println("Sorted array:");
        for (int value : num) {
            System.out.print(value + " ");
        }
    }

    static void bubble(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
