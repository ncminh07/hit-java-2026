import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nam vao day cho t : ");
        int soNam = scanner.nextInt();
        if(soNam % 400 == 0){
            System.out.print("Nam nhuan day !");
        }
        else{
            System.out.print("Nam thuong do cu");
        }
    }
}
