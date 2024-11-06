
package bai1;
import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(50) + 1; // Tạo số ngẫu nhiên từ 1 đến 50
        int guess = 0;

        System.out.println("Chao mung ban den voi tro choi doan so!");
        System.out.println("Hay doan mot so tu 1 den 50.");

        while (guess != targetNumber) {
            System.out.print("Nhap so ban doan: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("So cua ban thap hon. Hay thu lai!");
            } else if (guess > targetNumber) {
                System.out.println("So cua ban cao hon. Hay thu lai!");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so " + targetNumber + "!");
            }
        }

        scanner.close();
    }
}
