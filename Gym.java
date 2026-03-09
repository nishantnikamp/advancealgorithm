import java.util.Arrays;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = N - 1; i >= 0; i--) {
            if (E == 0) {
                System.out.println(count);
            }
            if (arr[i] * 2 <= E) {
                count += 2;
                E -= count;
            } else if (arr[i] <= E) {
                count += 1;
                E -= count;
            }
        }
        if (E == 0) {
            System.out.println(count);
        }
        else
        {
            count=-1;
        System.out.println(count);
        }
    }
}
