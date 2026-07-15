import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can tinh bang cuu chuong vao day : ");
        int nhapSo = scanner.nextInt();
        System.out.println("Bang cuu chuong " + nhapSo);
        int[] mang = {1,2,3,4,5,6,7,8,9,10};
        for( int i : mang ){
            System.out.println(nhapSo + " * " + i + " = " + (nhapSo * i));
        }
    }
}
