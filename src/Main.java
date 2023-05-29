import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Girin: ");
            n = input.nextInt();
            if (n % 4 == 0 || n% 2 == 0 ) {
                total += n;
                System.out.println("Çift sayı ve 4'e bölünebilen sayıların toplamı: " + total + "\n");
            }else {
                System.out.println("Tek sayı girdiniz.");
            }
        } while (n > 0);
        System.out.println("Sayıların Toplamı: " + total);
    }
}