import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Integer[] sum = new Integer[n];
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            sum[i] = nums[i] + nums[(2 * n) - (i + 1)];
        }
        
        Arrays.sort(sum, Collections.reverseOrder());

        System.out.println(sum[0]);
    }
}