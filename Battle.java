import java.util.Scanner;

public class Battle {
    public static int battle(int V, int H, int HL, int[] VL) {
        int hero = 0;
        int villain = 0;
        int heroHealth = HL;
        while (hero < H && villain < V) {
            if (heroHealth >= VL[villain]) {
                heroHealth -= VL[villain];
                villain++;

                if (villain == V)
                    break;
            } else {
                VL[villain] -= heroHealth;
                hero++;

                if (hero < H)
                    heroHealth = HL;
            }
        }
        return V - villain;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int H = sc.nextInt();
        int HL = sc.nextInt();
        int[] VL = new int[V];
        for (int i = 0; i < V; i++)
            VL[i] = sc.nextInt();
        int result = battle(V, H, HL, VL);
        System.out.println(result);
    }
}