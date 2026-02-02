import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] chkArr;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if ((i + 1) % 2 != 0) {
                if ((i + 1) == 1) System.out.print(arr[i] + " ");
                else {
                    chkArr = new int[i + 1];
                    for (int j = 0; j < i + 1; j++) {
                        chkArr[j] = arr[j];
                    }
                    Arrays.sort(chkArr);
                    //for (int c : chkArr) System.out.print(c + " ");
                    //System.out.println();
                    int mid = (i + 1) / 2;
                    System.out.print(chkArr[mid] + " ");
                }
            }
        }
    }
}