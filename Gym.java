import java.util.Arrays;
import java.util.Scanner;

public class Gym{
    public static int GymEx(int E, int N, int[] arr){
        
        Arrays.sort(arr);
        
        int count = 0;
        for(int i = N-1; i >=0; i--) {
            if (E == 0)
                break;
            if (2 * arr[i] <= E) {
                count += 2;
                E -= 2 * arr[i];
            }
            else if (arr[i] <= E) {
                    count++;
                    E -= arr[i];
            }
        }
        if(E == 0)
            return count;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int E = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(GymEx(E, N, arr));
    }

}
