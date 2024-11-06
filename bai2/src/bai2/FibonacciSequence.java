package bai2;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu n cua day Fibonacci: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Day Fibonacci voi " + n + " phan tu dau tien:");

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
