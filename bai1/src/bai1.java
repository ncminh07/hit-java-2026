import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai voa di dka : ");
        int chieuD = scanner.nextInt();
        System.out.print("Nhap chieu rong voa di dka : ");
        int chieuR = scanner.nextInt();
        System.out.println("Chu Vi la  : " + (2*chieuD + 2 * chieuR));
        System.out.println("Dien tich la  : " + chieuD * chieuR);

    }
}