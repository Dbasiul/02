package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite N: ");
        int n = sc.nextInt();
        
        int kiekis = 0;
        System.out.println("Lyginiai skaiciai:");
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                kiekis++;
            }
        }
        
        System.out.println();
        System.out.println("Count: " + kiekis);
    }
}
